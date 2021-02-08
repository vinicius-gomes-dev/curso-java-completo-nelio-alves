package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentSerice) {
		this.onlinePaymentService = onlinePaymentSerice;
	}
	
	public void contractProcess(Contract contract, int months) {
		
		for(int month = 1; month <= months; month++) {
			double installmentAmount = contract.getTotalValue() / months;
			installmentAmount += onlinePaymentService.interestRate(installmentAmount, month);
			installmentAmount += onlinePaymentService.paymentFee(installmentAmount);
			
			Date dueDate = contract.getDate();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dueDate);
			calendar.add(Calendar.MONTH, month);
			dueDate = calendar.getTime();
			
			contract.addInstallment(new Installment(dueDate, installmentAmount));
		}
		
	}

}
