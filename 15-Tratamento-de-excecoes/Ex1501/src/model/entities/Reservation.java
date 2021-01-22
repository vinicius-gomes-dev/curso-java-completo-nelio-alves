package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

import model.exceptions.DomainException;

public class Reservation {
	public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		Date now = new Date();
		
		if(checkOut.before(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		if(!checkIn.after(now) || !checkOut.after(now)) {
			throw new DomainException("Reservation dates must be future dates");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long duration = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Room " + roomNumber);
		sb.append(", check-in: " + SDF.format(checkIn) );
		sb.append(", check-out: " + SDF.format(checkOut) );
		sb.append(", " + duration() + " nights");
		
		return sb.toString();
	}

}
