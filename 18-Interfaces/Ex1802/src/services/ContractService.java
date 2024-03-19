package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private PaymentService paymentService;
	
	public ContractService(PaymentService paymentSerice) {
		this.paymentService = paymentSerice;
	}
	
	public void contractProcess(Contract contract, int months) {
		double installmentAmount = contract.getTotalValue() / months;
		
		for(int month = 1; month <= months; month++) {
			LocalDate dueDate = contract.getDate().plusMonths(month);
			
			double interest = paymentService.interestRate(installmentAmount, month);
			double fee = paymentService.paymentFee(installmentAmount + interest);
			double totalInstallment = installmentAmount + interest + fee;
			
			contract.addInstallment(new Installment(dueDate, totalInstallment));
		}
		
	}

}
