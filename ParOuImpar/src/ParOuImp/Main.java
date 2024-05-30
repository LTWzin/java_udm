package ParOuImp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("O numero é par!");
		}
		else {
			System.out.println("O numero é impar!");
		}
		System.out.print("FIM!");
		sc.close();
	}

}
