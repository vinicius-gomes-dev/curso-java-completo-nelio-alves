import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipo, alcool = 0, gasolina = 0, diesel = 0;

		do {
			tipo = sc.nextInt();

			switch (tipo) {
			case 1:
				alcool += 1;
				break;
			
			case 2:
				gasolina += 1;
				break;
				
			case 3:
				diesel += 1;
			}
		} while (tipo != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Álcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		sc.close();
	}

}
