import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int id1, id2, quantity1, quantity2;
		float unitPrice1, unitPrice2, subtotal1, subtotal2, total;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		id1 = sc.nextInt();
		quantity1 = sc.nextInt();
		unitPrice1 = sc.nextFloat();
		
		id2 = sc.nextInt();
		quantity2 = sc.nextInt();
		unitPrice2 = sc.nextFloat();
		
		subtotal1 = unitPrice1 * quantity1;
		subtotal2 = unitPrice2 * quantity2;
		
		total = subtotal1 + subtotal2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
