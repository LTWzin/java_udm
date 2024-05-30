package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter conversor = new CurrencyConverter();
		
		System.out.print("DIGITE O PRECO DO DOLAR: ");
		conversor.cotacao = sc.nextDouble(); 
		System.out.print("DIGITE A QUANTIA EM DOLARS DESEJADA: ");
		conversor.dollars = sc.nextDouble();
		
		System.out.println("APLICADA 6% DE IOF SOBRE O VALOR EM DOLAR");
		System.out.printf("QUANTIA EM REAIS A SER PAGA: R$ %.2f", conversor.conversao());
		
		sc.close();
	}

}
