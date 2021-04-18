package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Set<Product> products = new HashSet<>();
		
		products.add(new Product("TV", 900.0));
		products.add(new Product("Notebook", 1200.0));
		products.add(new Product("Tablet", 400.0));
		
		Product product = new Product("Notebook", 1200.0);
		
		System.out.println(products.contains(product));

	}

}
