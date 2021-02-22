package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjects = new ArrayList<>();
		
		System.out.println("myObjects: " + myObjects.toString());
		copy(myInts, myObjects);
		System.out.println("myObjects: " + myObjects.toString());
		copy(myDoubles, myObjects);
		System.out.println("myObjects: " + myObjects.toString());

	}
	
	public static <T> void copy(List<? extends T> source, List<? super T> target) {
		target.addAll(source);	
	}

}
