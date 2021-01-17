package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		// Registro das informações básicas do trabalhador
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("\nEnter the worker data:\n");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
		
		
		// Registro dos contratos do trabalhador
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%nEnter contract #%d data:%n", i + 1);
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = simpleDateFormat.parse(sc.nextLine());
			System.out.print("Value per hour: ");
			Double contractValuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer contractHours = sc.nextInt();
			sc.nextLine();
			HourContract contract = new HourContract(contractDate, contractValuePerHour, contractHours);
			worker.addContract(contract);
		}
			
			
			
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String incomeMonthAndYear = sc.nextLine();
		
		int incomeMonth = Integer.parseInt(incomeMonthAndYear.substring(0, 2));
		int incomeYear = Integer.parseInt(incomeMonthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %s ", incomeMonthAndYear, String.format("%.2f", worker.income(incomeMonth, incomeYear)) );
		
		
		
		sc.close();
	}

}
