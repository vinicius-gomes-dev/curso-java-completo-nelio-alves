package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import model.entities.Employee;
import model.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\n--> Employee #" + i + " data <--");
			
			System.out.print("Outsourced (y/n)? ");
			char employeeOutsourced = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String employeeName = sc.nextLine();
			
			System.out.print("Hours: ");
			int employeeHours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Value per hour: ");
			double employeeValuePerHour = sc.nextDouble();
			
			if(employeeOutsourced == 'n') {
				employees.add(new Employee(employeeName, employeeHours, employeeValuePerHour));
			}
			
			else if (employeeOutsourced == 'y') {
				System.out.print("Additional charge: ");
				double employeeAdditionalCharge = sc.nextDouble();
				sc.nextLine();
				employees.add(new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHour, employeeAdditionalCharge));
			}
			
		}
		
		System.out.println();
		System.out.println("==> PAYMENTS <==");
		for(Employee employee : employees) {
			employee.payment();
			System.out.println(employee);
		}
		
		sc.close();
	}

}
