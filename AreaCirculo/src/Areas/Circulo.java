package Areas;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a area do circulo: ");
		double raio = sc.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("Area = %.4f", area);
		
		sc.close();
	}
}
