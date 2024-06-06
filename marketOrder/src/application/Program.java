package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter Client Data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(), fmt1);
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter Order Data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order?  ");
		int orderQuantity = sc.nextInt();
		Order order = new Order(LocalDateTime.now(), status, client);
		
		for (int i=0;i<orderQuantity;i++) {
			System.out.printf("Enter #%d item data:\n", i+1);
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			System.out.println();
			
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(productQuantity, productPrice, product);
			order.addItem(item);	
		}
		System.out.println(order);
		sc.close();
	}
}
