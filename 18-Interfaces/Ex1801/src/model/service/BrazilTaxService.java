package model.service;

public class BrazilTaxService {
	
	public Double tax(double amount) {
		return (amount <= 100.00) ? amount * 0.2 : amount * 0.15;
	}

}
