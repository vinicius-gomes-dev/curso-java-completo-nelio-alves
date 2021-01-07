import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n1, n2, n3, n4, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();

	}

}
