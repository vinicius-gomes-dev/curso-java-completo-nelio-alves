package application;

import model.entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println("Cliente 1: " + c1.hashCode());
		System.out.println("Cliente 2: " + c2.hashCode());
		System.out.println(c1.hashCode() == c2.hashCode());
		System.out.println(c1.equals(c2));

	}

}
