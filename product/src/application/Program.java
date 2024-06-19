package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of products: ");
		int nop = sc.nextInt();
		
		for (int i=0;i<nop;i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("common, used or imported (c/u/i)?  ");
			String cui = sc.next();
			System.out.print("Product name: ");
			String name = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			if (cui.charAt(0) == 'u') {
				System.out.print("Manufacture date: ");
				LocalDate date = LocalDate.parse(sc.next(), fmt1);
				list.add(new UsedProduct(name, price, date)); 
			}
			else if ( cui.charAt(0) == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}
			else {
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		for (Product x : list) {
			System.out.println(x.priceTag());
		}
		sc.close();
	}
}
