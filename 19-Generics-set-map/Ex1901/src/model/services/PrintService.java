package model.services;

import java.util.List;
import java.util.ArrayList;

public class PrintService<T> {
	
	List<T> values = new ArrayList<>();
	
	public void addList(T value) {
		values.add(value);
	}
	
	public T firts() {
		if(values.isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		return values.get(0);
	}
	
	public void print() {
		if(values.isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		
		
		System.out.println(values.toString()); // There's a StringBuilder inside of the "toString" method

		
	}

}
