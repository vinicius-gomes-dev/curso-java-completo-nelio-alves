package application;

import java.util.Scanner;
import java.io.File;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "/testFolder").mkdir();
		System.out.println("Directore created successfully: " + sucess);
		
		sc.close();
	}

}
