package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import model.entities.Product;
import model.entities.ImportedProduct;
import model.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("--> Product #" + i + " data <--");
			System.out.print("Common, used or imported (c/u/i): ");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String productName = sc.nextLine();
			System.out.print("Price: ");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			
			if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date productManufactureDate = SDF.parse(sc.nextLine() );
				
				products.add(new UsedProduct(productName, productPrice, productManufactureDate) );
				
			}
			
			else if(productType == 'i') {
				System.out.print("Customs fee: ");
				double productCustomsFee = sc.nextDouble();
				sc.nextLine();
				
				products.add(new ImportedProduct(productName, productPrice, productCustomsFee) );
			}
			
			else if(productType == 'c') {
				products.add(new Product(productName, productPrice) );
			}
			
		}
		
		System.out.println();
		System.out.println("==> PRICE TAGS <==");
		for(Product product : products) {
			System.out.println(product.priceTag() );
		}
		
		
		
		sc.close();
	}

}
