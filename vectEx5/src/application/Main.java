package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Encontra o maior valor do vetor e sua posição.
		int position = 0;
		double biggest = 0;
		System.out.print("How many numbers will be typed?  ");
		int quantia = sc.nextInt();		
		double[] vect = new double[quantia];
		
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Type the %d° number: ", i+1);
			vect[i] = sc.nextDouble();
		}
		for (int i=0;i<vect.length;i++) {
			if (vect[i] > biggest) {
				biggest = vect[i];
				position = i;
			}
		}
		System.out.print("=-=-=-=-=-=-=-=-=-=-=");
		System.out.printf("\nBiggest value: %.1f\n"
				+ "Biggest value position: %d", biggest, position);
		sc.close();
	}
}
