import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int horaInicial, horaFinal, horaTotal;
		
		Scanner sc = new Scanner(System.in);
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial >= horaFinal) {
			horaTotal = 24 - (horaInicial - horaFinal);
		} else {
			horaTotal = horaFinal - horaInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", horaTotal);
		
		sc.close();

	}

}
