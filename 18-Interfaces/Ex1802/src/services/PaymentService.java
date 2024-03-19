package services;

public interface PaymentService {
	
	public double paymentFee(double amount);
	public double interestRate(double amount, int months);

}
