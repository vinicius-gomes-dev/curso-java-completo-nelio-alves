package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		// Registro dos funcionários
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:%n", i+1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			
			// Verifica se o ID informado já existe
			while (hasId(employees, id) ) {
				System.out.print("This ID already exist! Try another ID:");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			employees.add(new Employee(id, name, salary));
			
		}
		
		// Aumento salarial do funcionário indicado pelo ID
		
		System.out.print("\nEnter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Employee emp = employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
		
		if (emp != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			sc.nextLine();
						
		} else {
			System.out.println("This id does not exist!");
			
		}
		
		
		// Impressão da lista de funcionários
		
		System.out.println("\nList of employees:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> employees, int id) {
		Employee emp = employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
		return emp != null;
	}

}
