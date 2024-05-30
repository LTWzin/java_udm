package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Encontra os numeros negativos de um vetor.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantia de numeros que serão digitados?  ");
		int quantia = sc.nextInt();
		while (quantia > 10) {
			System.out.print("A quantia não pode ser maior que 10! Digite novamente:  ");
			quantia = sc.nextInt();
		}
		int[] vect = new int[quantia];
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Digite o %do numero: ", i+1);
			vect[i] = sc.nextInt();
		}
		System.out.println("Os seguintes numeros são negativos: ");
		for (int i = 0;i<vect.length;i++) {		
			if (vect[i]<0) {
					System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
