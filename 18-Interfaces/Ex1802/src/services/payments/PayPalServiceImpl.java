package services.payments;

import services.PaymentService;

public class PayPalServiceImpl implements PaymentService{
	
	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}
	
	@Override
	public double interestRate(double amount, int months) {
		return (amount * 0.01) * months;
	}

}