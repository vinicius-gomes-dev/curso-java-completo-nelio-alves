package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import model.entities.Shape;
import model.entities.Rectangle;
import model.entities.Circle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("--> Shape #" + i + " data <--");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shapeType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String shapeColor = sc.nextLine();

			switch (shapeType) {

			case 'r':
				System.out.print("Width: ");
				double shapeWidth = sc.nextDouble();
				sc.nextLine();
				System.out.print("Height: ");
				double shapeHeight = sc.nextDouble();
				sc.nextLine();
				
				shapes.add(new Rectangle(Color.valueOf(shapeColor), shapeWidth, shapeHeight) );
				break;

			case 'c':
				System.out.print("Radius: ");
				double shapeRadius = sc.nextDouble();
				sc.nextLine();
				
				shapes.add(new Circle(Color.valueOf(shapeColor), shapeRadius) );
				break;
			}
		}
		
		System.out.println("==> SHAPE AREAS <==");
		for(Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()) );
		}

		sc.close();
	}

}
