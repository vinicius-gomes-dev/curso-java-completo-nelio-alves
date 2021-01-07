package entities;

public class Room {
	private String name;
	private String email;
	private int number;
	
	public Room(String name, String email, int number) {
		this.name = name;
		this.email = email;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return number + ": "
				+ name + ", "
				+ email;
	}
	
}
