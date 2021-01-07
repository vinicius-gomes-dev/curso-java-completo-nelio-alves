import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), fatorial = n;
		
		
		for (int i = n-1; i > 0; i--) {
			fatorial *= i;
		}
		
		fatorial = (n != 0) ? fatorial : 1;
		System.out.println(fatorial);

		sc.close();
	}
}
