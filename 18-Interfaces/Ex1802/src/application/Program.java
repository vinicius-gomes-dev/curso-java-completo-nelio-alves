package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("==> Enter contract data <==");
		
		System.out.print("Number: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/mm/yyyy): ");
		Date contractDate = SDF.parse(sc.nextLine());
		System.out.print("Contract value: $");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, contractDate, contractValue);
		
		System.out.println();
		System.out.print("Enter the number of installments: ");
		int installmentNumber = sc.nextInt();
		sc.nextLine();
		
		ContractService  contractService = new ContractService(new PaypalService());
		contractService.contractProcess(contract, installmentNumber);
		
		System.out.println();
		System.out.println("==> Installments <==");
		for(Installment installment : contract.getInstallments()) {
			StringBuilder sb = new StringBuilder();
			sb.append(SDF.format(installment.getDueDate() ) + " - ");
			sb.append(String.format("%.2f", installment.getAmount()));
			System.out.println(sb);
		}
		

		sc.close();
	}

}
