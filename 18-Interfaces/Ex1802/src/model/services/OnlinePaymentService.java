package model.services;

public interface OnlinePaymentService {
	
	public double paymentFee(double amount);
	public double interestRate(double amount, int months);

}
