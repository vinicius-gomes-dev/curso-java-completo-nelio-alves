package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		String path = "./input.txt";
		List<String> names = new ArrayList<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			String field = bf.readLine();

			while (field != null) {
				names.add(field);
				field = bf.readLine();
			}

			names.forEach(name -> System.out.println(name));
			System.out.println();

			Collections.sort(names);
			
			System.out.println("==> SORTED <==");
			names.forEach(name -> System.out.println(name));
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
