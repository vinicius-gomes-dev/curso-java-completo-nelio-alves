package model.services;

public class TaxServiceImpl implements TaxService{
	
	public double brasilTax(double amount) {
		return (amount <= 100.00) ? amount * 0.2 : amount * 0.15;
	}

}
