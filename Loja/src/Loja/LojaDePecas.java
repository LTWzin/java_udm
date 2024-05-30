package Loja;

import java.util.Scanner;
import java.util.Locale;

public class LojaDePecas {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cod1, cod2, quantia1, quantia2;
		double prec1, prec2, total1, total2, total3;
		
		System.out.println("Digite as informaçoes do produto 1:");
		System.out.println("(codigo quantia e preço)");
		cod1 = sc.nextInt();
		quantia1 = sc.nextInt();
		prec1 = sc.nextDouble();
		
		System.out.println("Digite as informacoes do produto 2:");
		cod2 = sc.nextInt();
		quantia2 = sc.nextInt();
		prec2 = sc.nextDouble();
		
		total1 = quantia1 * prec1;
		total2 = quantia2 * prec2;
		total3 = total1 + total2; 
		
		System.out.printf("Total do produto 1 (codigo: %d): R$%.2f"
				+ "%nTotal do produto 2 (codigo: %d): R$%.2f%n"
				+ "Preço total: R$%.2f", cod1, total1, cod2, total2, total3); 
		
		sc.close();
			
	}

}
