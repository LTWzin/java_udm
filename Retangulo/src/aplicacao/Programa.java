package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidades.retangulo;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		retangulo reta = new retangulo();
		
		System.out.println("Digite a largura e a altura do retangulo: ");
		reta.largura = sc.nextDouble();
		reta.altura = sc.nextDouble();
		
		System.out.printf("Area: %.2f\n", reta.area());
		System.out.printf("Perimetro: %.2f\n", reta.perimetro());
		System.out.printf("Diagonal: %.2f\n", reta.diagonal());
		
		sc.close();
	}
}
