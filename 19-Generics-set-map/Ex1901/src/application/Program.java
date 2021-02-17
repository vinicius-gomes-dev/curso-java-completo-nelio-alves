package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> printService = new PrintService<>();
		
		System.out.print("How many values: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			int number = sc.nextInt();
			printService.addList(number);
		}
		
		printService.print();
		System.out.println("First: " + printService.firts());
		
		sc.close();
	}

}
