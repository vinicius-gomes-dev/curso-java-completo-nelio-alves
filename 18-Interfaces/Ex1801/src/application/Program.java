package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.TaxServiceImpl;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		System.out.println("==> Enter rental data <==");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		
		System.out.print("Pickup (dd/mm/yyyy hh:mm): ");
		LocalDateTime dateStart = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
		
		System.out.print("Return (dd/mm/yyyy hh:mm): ");
		LocalDateTime dateFinish = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
		
		CarRental carRental = new CarRental(dateStart, dateFinish, new Vehicle(carModel));
		
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		sc.nextLine();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new TaxServiceImpl());
		rentalService.processInvoice(carRental);
		
		System.out.println();
		System.out.println("==> INVOICE <==");
		System.out.println("Basic payment: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: $" + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: $" + String.format("%.2f", carRental.getInvoice().getTotalPaymeny()));
		
		sc.close();
	}

}
