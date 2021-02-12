package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "./input.txt";
		List<Employee> employees = new ArrayList<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			String employeeCsv = bf.readLine();

			while (employeeCsv != null) {
				String[] field = employeeCsv.split(",");
				employees.add(new Employee(field[0], Double.parseDouble(field[1])));
				employeeCsv = bf.readLine();
			}

			employees.forEach(employee -> System.out.println(employee));
			System.out.println();

			Collections.sort(employees);
			
			System.out.println("==> SORTED <==");
			employees.forEach(employee -> System.out.println(employee));
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
