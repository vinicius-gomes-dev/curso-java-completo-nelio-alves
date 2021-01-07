import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int employeeId, workedHours;
		float hourSalary, salary;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employeeId = sc.nextInt();
		workedHours = sc.nextInt();
		hourSalary = sc.nextFloat();
		
		salary = workedHours * hourSalary;
		
		System.out.printf("NUMBER = %d%n", employeeId);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();

	}

}
