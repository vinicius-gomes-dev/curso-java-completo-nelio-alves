package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Set<Product> products = new TreeSet<>();
		
		products.add(new Product("TV", 900.0));
		products.add(new Product("Notebook", 1200.0));
		products.add(new Product("Tablet", 400.0));
		
		for(Product product : products) {
			System.out.println(product);
		}

	}

}
