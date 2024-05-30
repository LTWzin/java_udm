package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Imprime a soma e a media de valores de um vetor.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		
		System.out.print("Enter how many values will be typed:  ");
		int quantia = sc.nextInt();
		double[] vect = new double[quantia];
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Type the %do number: ", i+1);
			vect[i] = sc.nextDouble();
		}
		System.out.print("values: ");
		for (int i=0; i<vect.length;i++) {
			System.out.print(vect[i] + "; ");
			sum += vect[i];
		}
		System.out.printf("\nSum: %.2f \n", sum);
		System.out.printf("Average: %.2f", sum/vect.length);
		sc.close();
	}
}
