package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		Room[] room = new Room[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			room[number] = new Room(name, email, number); 
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (room[i] != null) {
				System.out.println(room[i]);
			}
		}
		
		sc.close();
	}

}
