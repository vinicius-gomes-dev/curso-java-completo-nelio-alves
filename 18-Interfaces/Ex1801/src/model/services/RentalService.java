package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long miliStart = carRental.getStart().getTime();
		long miliFinish = carRental.getFinish().getTime();
		
		double hours = (double)(miliFinish - miliStart) / 1000 / 60 / 60;
		double basicPayment = (hours <= 12.0) ? Math.ceil(hours) * pricePerHour : Math.ceil(hours / 24) * pricePerDay;
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	

}
