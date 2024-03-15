package model.services;

import java.time.Duration;

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
		double rentalTimeMinutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double rentalTimeHours = rentalTimeMinutes / 60;
		double rentalTimeDays = rentalTimeHours / 24;
		
		double basicPayment = (rentalTimeHours <= 12.0) ? Math.ceil(rentalTimeHours) * pricePerHour : Math.ceil(rentalTimeDays) * pricePerDay;
		
		double tax = taxService.brasilTax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	

}
