package Posto;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int atual = 0;
		int preferencia = 0;
		int clientes;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0 ;
		
		System.out.println("Digite a quantia de pessoas que irão participar da pesquisa:");
		clientes = sc.nextInt();
		
		System.out.println("1.Alcool;\n2.Gasolina;\n3.Disel;");
		while (atual != clientes) {
			
			System.out.printf("Digite a prerencia da pessoa %d:  ", atual + 1);
			preferencia = sc.nextInt();
			
			if (preferencia == 1) {
				alcool += 1;
			}
			else if (preferencia == 2) {
				gasolina += 1;
			}
			else if (preferencia == 3) {
				disel += 1;
			}
			else {
				System.out.println("Item invalido!");
			}
			atual += 1;
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Preferencias:");
		System.out.printf("ALCOOL: %d\nGASOLINA: %d\nDISEL: %d\n", alcool, gasolina, disel);
		
		sc. close();
	}
}

