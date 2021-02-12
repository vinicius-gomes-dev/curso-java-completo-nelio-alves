package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();
		System.out.print("Months: ");
		int months = sc.nextInt();
		sc.nextLine();
		
		InterestService interestService = new UsaInterestService(1.0);
		double totalPayment = interestService.payment(amount, months);
		
		System.out.println("==> Payment after " + months + " months <==");
		System.out.println(String.format("%.2f", totalPayment));
		
		sc.close();
	}

}
