package ab;

import java.util.Locale;

public class ex001 {
	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double tamanho = 53.234567;
		
		System.out.println("Produto:");
		System.out.printf("%s, preço de compra de R$%.2f %n", produto1, preco1);
		System.out.printf("%s, preço de compra de R$%.2f %n", produto2, preco2);
		
		System.out.printf("%nFicha: %d anos de idade, codigo %d e genero %s%n", idade, codigo, genero);
		
		System.out.printf("%nTamanho com oito casas decimais: %.8f%n", tamanho);
		System.out.printf("Arredondado (três casas decimais): %.3f%n", tamanho);
		Locale.setDefault(Locale.US);
		System.out.printf("Separador decimal agora como ponto: %.3f%n", tamanho);
		
	}
}
