package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Worker;
import entities.Department;
import entities.HourContract;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Dados base do funcionário
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("\n--> Enter the worker data <--");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = sc.nextDouble();
		sc.nextLine();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
				new Department(departmentName));

		// Dados dos contratos dos funcionários
		System.out.print("\nHow many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i = 1; i <= n; i++) {
			System.out.println("--> Enter contract #" + i + " data <--");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = dateFormat.parse(sc.nextLine());
			System.out.print("Value per hour: ");
			double contractValuePerHour = sc.nextDouble();
			sc.nextLine();
			System.out.print("Duration (hours): ");
			int contractHours = sc.nextInt();
			sc.nextLine();

			HourContract contract = new HourContract(contractDate, contractValuePerHour, contractHours);
			worker.addContract(contract);

		}

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String incomeMonthAndYear = sc.nextLine();

		int incomeMonth = Integer.parseInt(incomeMonthAndYear.substring(0, 2));
		int incomeYear = Integer.parseInt(incomeMonthAndYear.substring(3));

		StringBuilder sbToString = new StringBuilder();

		sbToString.append("Name: " + worker.getName() + "\n");
		sbToString.append("Department: " + worker.getDepartment().getName() + "\n");
		sbToString.append("Income for " + incomeMonthAndYear + ": " 
				+ String.format("%.2f", worker.income(incomeYear, incomeMonth)));

		System.out.println(sbToString);

		sc.close();
	}

}
