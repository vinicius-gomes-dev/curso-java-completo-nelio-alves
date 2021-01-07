import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double number = sc.nextDouble();
		
		if (number < 0.0 || number > 100.0) {
			System.out.println("Fora do Intervalo");
		}
		else if (number <= 25.0) {
			System.out.println("Intervalo [0, 25]");
		}
		else if (number <= 50.0) {
			System.out.println("Intervalo [25, 50]");
		}
		else if (number <= 75.0) {
			System.out.println("Intervalo [50, 75]");
		}
		else if (number <= 100.0) {
			System.out.println("Intervalo [75, 100]");
		}
		
		sc.close();
	}

}
