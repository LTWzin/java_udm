package numeros;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double total;
		
		System.out.println("Digite um numero:");
		total = sc.nextDouble();
		
		Double atual = 1.0;
		while (atual != 0) {
		
			System.out.println("Digite outro numero (Digite '0' para parar):");	
			atual = sc.nextDouble();
			if (atual == 0) {
				break;
			}
			else {
				total += atual;
			}
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("A soma dentre os numeros digitados resulta em: %.1f", total);
		
		sc.close();
	}

}
