package Calcular;
import java.util.Scanner;

public class Soma {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Digite o primeiro numero: ");
		int primeiro = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int segundo = sc.nextInt();
		
		int soma = primeiro + segundo;
		
		System.out.printf("A soma entre %d + %d resulta em %d", primeiro, segundo, soma);
		
		sc.close();
	}
		

}
