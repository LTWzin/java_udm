package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rental;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented?  ");
		int quantity = sc.nextInt();
		System.out.println();
		
		Rental[] vect = new Rental[10];
		
		for (int i=0;i<quantity;i++) {
			System.out.printf("Rent #%d\nName: ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Rental(name, email, room); 
		}
		
		System.out.println("Bussy rooms:");
		for (int i=0;i<10;i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
