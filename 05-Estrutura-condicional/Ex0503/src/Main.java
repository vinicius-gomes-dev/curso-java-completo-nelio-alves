import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a, b, maior, menor;
		 
		 a = sc.nextInt();
		 b = sc.nextInt();
		 
		 if (a >= b) {
			 maior = a;
			 menor = b;
		 } else {
			 maior = b;
			 menor = a;
		 }
		 
		 if (maior % menor == 0) {
			 System.out.println("Sao Multiplos");
		 } else {
			 System.out.println("Nao sao Multiplos");
		 }
		 
		 sc.close();

	}

}
