package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		//Gera um vetor C com as respectivas somas dos vetores A e B.
		System.out.print("How many numbers will there be in each vector?  ");
		int quantia = sc.nextInt();
		
		int[] vectA = new int[quantia];
		int[] vectB = new int[quantia];
		int[] vectC = new int[quantia];
		
		System.out.println("Vector A: ");
		for (int i=0;i<vectA.length;i++) {
			System.out.printf("Type the %d° value: ", i+1);
			vectA[i] = sc.nextInt();
		}
		System.out.println("Vector B: ");
		for (int i=0;i<vectB.length;i++) {
			System.out.printf("Type the %d° value: ", i+1);
			vectB[i] = sc.nextInt();
		}
		System.out.println("Resulting vector (vector C): ");
		for (int i=0;i<vectC.length;i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		sc.close();
	}
}
