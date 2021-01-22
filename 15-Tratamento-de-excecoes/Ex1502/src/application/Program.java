package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("--> Enter account data <--");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			account.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()) );
			
			sc.close();
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage() );
		}
		catch(RuntimeException e) {
			System.out.println("\nUnexpected error!\n");
			e.printStackTrace();
		}
	}

}
