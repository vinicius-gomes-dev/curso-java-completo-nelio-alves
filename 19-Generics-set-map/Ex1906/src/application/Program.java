package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Teclado");
		set.add("HD");
		
		if(set.contains("Tablet")) {
			set.remove("Tablet");
		}
		
		set.removeIf(x -> x.charAt(0) == 'T' || x.length() > 3);
		
		for(String line : set) {
			System.out.println(line);			
		}

	}

}
