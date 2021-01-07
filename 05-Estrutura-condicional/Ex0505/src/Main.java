import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto, quantidadeProduto;
		float precoProduto = 0, total;

		codigoProduto = sc.nextInt();
		quantidadeProduto = sc.nextInt();

		if (codigoProduto == 1) {
			precoProduto = 4f;
			
		} else if (codigoProduto == 2) {
			precoProduto = 4.5f;
			
		} else if (codigoProduto == 3) {
			precoProduto = 5f;
			
		} else if (codigoProduto == 4) {
			precoProduto = 2f;
			
		} else if (codigoProduto == 5) {
			precoProduto = 1.5f;
			
		}
		
		total = precoProduto * quantidadeProduto;
		
		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

}
