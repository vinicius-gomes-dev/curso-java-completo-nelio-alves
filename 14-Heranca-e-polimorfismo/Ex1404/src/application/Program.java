package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import model.entities.TaxPayer;
import model.entities.Individual;
import model.entities.Company;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("--> Tax payer #" + i + " data <--");
			System.out.print("Individual or Company (i/c)? ");
			char taxPayerType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String taxPayerName = sc.nextLine();
			System.out.print("Anual income: ");
			double taxPayerAnualIncome = sc.nextDouble();
			sc.nextLine();
			
			if(taxPayerType == 'i') {
				System.out.print("Health expenditures: ");
				double taxPayerHealthExpenditures = sc.nextDouble();
				sc.nextLine();
				
				taxPayers.add(new Individual(taxPayerName, taxPayerAnualIncome, taxPayerHealthExpenditures) );
			}
			
			else if(taxPayerType == 'c') {
				System.out.print("Number of employees: ");
				int taxPayerNumberOfEmployees = sc.nextInt();
				sc.nextLine();
				
				taxPayers.add(new Company(taxPayerName, taxPayerAnualIncome, taxPayerNumberOfEmployees) );
			}
			
		}
		
		double sumTotalTaxes = 0.0;
		System.out.println();
		System.out.println("==> TAXES PAID <==");
		for(TaxPayer taxPayer : taxPayers) {
			sumTotalTaxes += taxPayer.tax();
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax() ) );
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sumTotalTaxes) );
		
		
		sc.close();
	}

}
