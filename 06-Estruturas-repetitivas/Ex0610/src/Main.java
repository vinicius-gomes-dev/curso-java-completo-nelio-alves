import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), quadrado = 0, cubo = 0;
		
		for (int i = 1; i <= n; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();
	}
	
}
