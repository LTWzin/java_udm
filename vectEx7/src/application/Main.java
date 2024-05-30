package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Encontra a media do vetor e imprime os numeros menores que a media total.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double average = 0;
		
		System.out.print("How many numbers will be typed?  ");
		int quantia = sc.nextInt();
		double[] vect = new double[quantia];
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Type the %d° number: ", i+1);
			vect[i] = sc.nextDouble();
			average += vect[i];
		}
		System.out.println();
		System.out.printf("Average: %.2f\n", average/quantia);
		System.out.println("Values ​​below average: ");
		for (int i=0;i<vect.length;i++) {
			if (vect[i] < average/quantia) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
