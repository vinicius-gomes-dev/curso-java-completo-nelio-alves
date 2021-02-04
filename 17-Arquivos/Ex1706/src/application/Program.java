package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		String strFile = "./testFolder/products.txt";
		File file = new File(strFile);
//		Scanner sc = null;
		List<Product> products = new ArrayList<>();
		
		// Reading data
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
//			sc = new Scanner(file);
			
			String lineCsv = br.readLine();
			while(lineCsv != null) {
				String[] lineFields = lineCsv.split(",");
				String name = lineFields[0];
				double price = Double.parseDouble(lineFields[1]);
				int quantity = Integer.parseInt(lineFields[2]);
				
				products.add(new Product(name, price, quantity));
				
				lineCsv = br.readLine();
			}
			
			
			// Writing out data
			File fileOut = new File(file.getParent() + "/out/summary.txt");
			File pathOut = new File(fileOut.getParent());
			
			
			@SuppressWarnings("unused")
			boolean isPathExists = new File(pathOut.toString()).mkdir();
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))){
				for(Product product : products) {
					
					bw.write(product.toString());
					bw.newLine();
				}
				System.out.println("Success!");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
