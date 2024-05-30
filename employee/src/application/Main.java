package application;
import java.util.Scanner;
import entities.productData;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER PRODUCT DATA:");
		System.out.print("Name:  ");
		String name = sc.nextLine();
		
		System.out.print("Price:  R$ ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock:  ");
		int quantity = sc.nextInt();
		
		productData Product = new productData(name, price, quantity);
		
		System.out.println("PRODUCT DATA:");
		System.out.printf("NAME: %s; "
				+ "Price: %.2f; "
				+ "%d Units %n"
				+ "Total value in stock: %.2f  %n", Product.getName() , Product.getPrice() , Product.getQuantity() , Product.totalValueInStock());
		
		System.out.print("Type the quantity to be added to the stock:  ");
		quantity = sc.nextInt();
		Product.addStock(quantity);
		
		System.out.println("PRODUCT DATA:");
		System.out.printf("Name: %s; "
				+ "Price: %.2f; "
				+ "%d Units; %n"
				+ "Total value in stock: %.2f %n", Product.getName() , Product.getPrice() , Product.getQuantity() , Product.totalValueInStock());
	
		
		System.out.print("Type the quantity to be removed from the stock:  ");
		quantity = sc.nextInt();
		Product.removeStock(quantity);
		
		System.out.println("NEW PRODUCT DATA:");
		System.out.printf("NAME: %s; "
				+ "Price: %.2f; "
				+ "%d Units %n"
				+ "Total value in stock: %.2f", Product.getName() , Product.getPrice() , Product.getQuantity() , Product.totalValueInStock());
		
		sc.close();
	}

}
