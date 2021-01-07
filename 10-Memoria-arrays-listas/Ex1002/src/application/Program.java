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
		
		System.out.print("How many employess will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%nEmployee #%d:%n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
//			sc.nextLine();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		Integer idToIncrease = sc.nextInt();
//		sc.nextLine();
		
		Employee emp = employees.stream().filter(employee -> employee.getId().equals(idToIncrease)).findFirst().orElse(null);
		if(emp != null) {
			System.out.print("Enter the porcentage: ");
			double porcentageToIncrease = sc.nextDouble();
			sc.nextLine();
			emp.increaseSalary(idToIncrease, porcentageToIncrease);
		} else {
			System.out.println("This id does not exist!\n");
		}
		
		
		System.out.println("List of Employees:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
