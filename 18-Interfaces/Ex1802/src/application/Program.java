package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.payments.PayPalServiceImpl;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("==> Enter contract data <==");
		
		System.out.print("Number: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/mm/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.nextLine(), dateFormatter);
		
		System.out.print("Contract value: $");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, contractDate, contractValue);
		
		System.out.print("\nEnter the number of installments: ");
		int installmentNumber = sc.nextInt();
		sc.nextLine();
		
		ContractService  contractService = new ContractService(new PayPalServiceImpl());
		contractService.contractProcess(contract, installmentNumber);
		
		System.out.println("\n==> Installments <==");
		contract.getInstallments().forEach(System.out::println);
		

		sc.close();
	}

}
