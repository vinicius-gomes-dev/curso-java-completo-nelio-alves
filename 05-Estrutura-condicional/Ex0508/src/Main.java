import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0.0;
		double salary = sc.nextDouble();
		
		if (salary >= 0.0 && salary < 2000.01) {
			System.out.println("Isento");
		}
		else if (salary < 3000.01) {
			imposto = (salary - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else if (salary < 4500.01) {
			imposto = (1000 * 0.08) + ((salary - 3000.00)  * 0.18);
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			imposto = (1000 * 0.08) + (1500.00 * 0.18) + ((salary - 4500) * 0.28);
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
