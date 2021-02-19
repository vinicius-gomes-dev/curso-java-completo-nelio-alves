package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Rectangle(3.0, 2.0));
		shapes.add(new Circle(2.0));
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(2.0));
		circles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(circles));

	}
	
	
	public static double totalArea(List<? extends Shape> shapes) {
		double sum = 0.0;
		
		for(Shape shape : shapes) {
			sum += shape.area();
		}
		
		return sum;
	}

}
