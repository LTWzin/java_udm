package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int bigest = 0;
		String nBigest = null;
		
		System.out.print("How many people will be in the list?  ");
		int quantity = sc.nextInt();
		String[] vectN = new String[quantity];
		int[] vectA = new int[quantity];
		for (int i=0;i<vectN.length;i++) {
			System.out.printf("%dst person data:\n", i+1);
			System.out.print("Name: ");
			vectN[i] = sc.next();
			System.out.print("Age: ");
			vectA[i] = sc.nextInt();
			if (vectA[i]>bigest) {
				bigest = vectA[i];
				nBigest = vectN[i];
			}
		}
		System.out.println("=-=-=-=-=-=-=--=-=-=");
		System.out.printf("Older: %s, with %d years.", nBigest, bigest);
		sc.close();
	}
}
