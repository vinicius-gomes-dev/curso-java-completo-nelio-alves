import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nIn = 0, nOut = 0, n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x >= 10 && x <=20) {
				nIn++;
			}
			else {
				nOut++;
			}
		}
		
		System.out.println(nIn + " in");
		System.out.println(nOut + " out");
		
		sc.close();
	}

}
