package application;

import entities.AbstractShapeImpl;
import entities.Circle;
import entities.Rectangle;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		AbstractShapeImpl s1 = new Circle(Color.WHITE, 2.0);
		AbstractShapeImpl s2 = new Rectangle(Color.BLACK, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()) );
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()) );

	}

}
