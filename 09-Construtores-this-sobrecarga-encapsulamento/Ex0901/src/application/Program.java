package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBancaria;

		System.out.print("Enter account number: ");
		String conta = sc.nextLine();

		System.out.print("Enter account holder: ");
		String nomeTitular = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char depositoInicial = sc.next().charAt(0);
		
		
		
		
		if (depositoInicial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldo = sc.nextDouble();
			contaBancaria = new ContaBancaria(conta, nomeTitular, saldo);
		}
		else {
			contaBancaria = new ContaBancaria(conta, nomeTitular);
		}
		
		System.out.println("\nAccount data:\n" + contaBancaria);
		
		System.out.print("\nEnter a deposit value: ");
		double deposito = sc.nextDouble();
		contaBancaria.deposito(deposito);
		System.out.println("Updated account data:\n" + contaBancaria);
		
		System.out.print("\nEnter a withdraw value: ");
		double saque = sc.nextDouble();
		contaBancaria.saque(saque);
		System.out.println("Updated account data:\n" + contaBancaria);
		

		sc.close();
	}

}
