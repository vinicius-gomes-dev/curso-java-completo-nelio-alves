package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "./input.txt";
		List<Product> products = new ArrayList<>();
		
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path) ) ){
			String lineFile = bf.readLine();
			
			while(lineFile != null) {
				String[] fields = lineFile.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1]) ) );
				
				lineFile = bf.readLine();
			}
			
			Product product = CalculationService.max(products);
			
			System.out.println("Most expensive:");
			System.out.println(product);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
