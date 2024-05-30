package Cardapio;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Cachorro-Quente - R$ 4.00");
		System.out.println("2.X-Salada - R$ 4.50");
		System.out.println("3.x-Bacon - R$ 5.00");
		System.out.println("4.Torrada - R$ 2.00");
		System.out.println("5.Refrigerante - R$ 1.50");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Digite seu pedido (numero do pedido e quantia): ");
		int pedido = sc.nextInt();
		int quantia = sc.nextInt();
		
		double total;
		if (pedido == 1) {
			total = quantia * 4.00;
		}
		else if (pedido == 2) {
			total = quantia * 4.50;
		}
		else if (pedido == 3) {
			total = quantia * 5.00;
		}
		else if (pedido == 4) {
			total = quantia * 2.00;
		}
		else if (pedido == 5) {
			total = quantia * 1.50;
		}
		else {
			total = 0;
		}
		
		System.out.printf("Seu pedido esta pronto! Total: R$ %.2f%n", total);
			
		sc.close();
	}
	
}

