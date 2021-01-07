package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int mat[][] = new int[m][n];
		
		for(int x = 0; x < mat.length; x++) {
			for(int y = 0; y < mat[x].length; y++) {
				mat[x][y] = sc.nextInt();
			}			
		}
		int num = sc.nextInt();
		
		for (int x = 0; x < mat.length; x++) {
			for(int y = 0; y < mat[x].length; y++) {
				if((mat[x][y]) == num) {
					System.out.printf("Position: %d, %d%n", x, y);
					
					boolean left = (y-1) >= 0;
					boolean right = (y+1) < mat[x].length;
					boolean up = (x-1) >= 0;
					boolean down = (x+1) < mat.length; 
					
					if(left) {
						System.out.println("Left: " + mat[x][y-1]);
					}
					if(up) {
						System.out.println("Up: " + mat[x-1][y]);
					}
					if(right) {
						System.out.println("Right: " + mat[x][y+1]);
					}
					if(down) {
						System.out.println("Down: " + mat[x+1][y]);
					}
				}
			}
		}
		
		
		sc.close();
	}
}
