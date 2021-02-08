package model.services;

public class PaypalService implements OnlinePaymentService{
	
	public double paymentFee(double amount) {
		return amount * 0.02;
	}
	
	public double interestRate(double amount, int months) {
		return (amount * 0.01) * months;
	}

}
