package numeros;

import java.util.Scanner;
public class PosOuNeg {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("É um numero positivo!");
		}
		else {
			System.out.println("É um numero negativo!");
		}
	sc.close();
	}

}
