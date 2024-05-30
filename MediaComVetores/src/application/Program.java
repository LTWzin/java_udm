package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args){
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0;
		
		System.out.print("Digite a quantia de pessoas que responderão a pesquisa:  ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite a altura da pessoa %d: ", i+1);
				vect[i] = sc.nextDouble();	
		}
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.printf("A media de altura das %d pessoas da pesquisa é igual a %.2f!", n, media);
		
		sc.close();
	}
}
