package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	private LocalDate dueDate;
	private Double amount;
	
	private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment() {
	}
	
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return getDueDate().format(DATE_FORMATTER) + " - " + String.format("%.2f", amount);
	}

}
