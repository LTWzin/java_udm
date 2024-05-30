package Numeros;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Digite três números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		int maior = max(x, y, z);
		System.out.println("O maior número digitado é: " + maior);
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		
		int mais;
		if (a > b && a > c) {
			mais = a;
		}
		else if (b > c) {
			mais = b;
			
		}
		else {
			mais = c;
		}
		return mais;
	}
}

