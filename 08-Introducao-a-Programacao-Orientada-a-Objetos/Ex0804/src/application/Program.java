package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarPurchased = sc.nextDouble();
		
		double reaisConverted = CurrencyConverter.convertDollarToReal(dollarPrice, dollarPurchased);
		System.out.printf("%nAmount to be paid in reais = %.2f", reaisConverted);
		
		sc.close();
	}

}
