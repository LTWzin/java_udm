package Numeros;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//	Programa para entregar apenas os numeros impares entre 0 e X;
		
		System.out.print("Digite um numero inteiro:  ");
		int X = sc.nextInt();
		
		for (int c = 0; c != X; c += 1) {
		
			if (c % 2 != 0) {
				System.out.println(c);
				
			}
		}
		if (X % 2 != 0) {
			System.out.println(X);
		}
		sc.close();
	}
}

