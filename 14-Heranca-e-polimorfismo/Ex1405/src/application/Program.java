package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = SDF.parse(sc.nextLine() );
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkOut = SDF.parse(sc.nextLine() );
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("--> Enter data to update the reservation <--");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = SDF.parse(sc.nextLine() );
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkOut = SDF.parse(sc.nextLine() );
			
			System.out.println();
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
		}
		catch(ParseException e) {
			System.out.println("\nError in reservation: " + e.getMessage() );
		}
		catch(DomainException e) {
			System.out.println("\nError in reservation: " + e.getMessage() );
		}
		catch(RuntimeException e) {
			System.out.println("\nUnexpected error!\n");
			e.printStackTrace();
		}
		
		sc.close();			
		
		
		
		
	}

}
