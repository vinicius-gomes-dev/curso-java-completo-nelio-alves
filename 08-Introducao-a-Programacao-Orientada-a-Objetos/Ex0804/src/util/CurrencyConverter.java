package util;

public class CurrencyConverter {
	
	public static double convertDollarToReal(double dollarPrice, double dollarPurchased) {
		return dollarPrice * dollarPurchased * 1.06;
	}

}
