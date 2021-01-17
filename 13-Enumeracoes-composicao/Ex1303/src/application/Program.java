package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Cadastro do Cliente
		System.out.println("--> CLIENTE DATA <--");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthDate =  sdf.parse(sc.nextLine());
		
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		
		System.out.println("\n--> ORDER DATA <--");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\n--> Enter #" + i + " item data <--");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			int orderItemQuantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(orderItemQuantity, productPrice, product);
			order.addItem(item);
		}
		
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
