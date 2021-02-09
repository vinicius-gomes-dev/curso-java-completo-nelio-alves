package application;

import model.entities.Printer;
import model.entities.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println();
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
	}
}