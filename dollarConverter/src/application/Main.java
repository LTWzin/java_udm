package application;

import java.util.Scanner;
import entities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Type the dollar's quote:  ");
		double price = sc.nextDouble();
		System.out.print("Type how many dollar's will be bougth:  ");
		double quantity = sc.nextDouble();
			
		double total =  CurrencyConverter.conversion(price, quantity);
		
		System.out.printf("AMOUNT TO BE PAID IN REAIS:  R$ %.2f ", total);
		
		sc.close();
	}

}
