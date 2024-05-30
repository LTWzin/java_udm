package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Encontra os numeros pares do vetor e a quantia dos mesmos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pair = 0;
		
		System.out.print("How many numbers will be typed?  ");
		int quantia = sc.nextInt();
		int[] vect = new int[quantia];
		
		for (int i=0;i<vect.length;i++) {
			System.out.print("Type a number: "); 
			vect[i] = sc.nextInt();
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("PAIR NUMBERS:");
		for (int i=0;i<vect.length;i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				pair += 1;
			}
		}
		System.out.printf("\nAmount of even numbers: %d", pair);
		sc.close();
	}
}
