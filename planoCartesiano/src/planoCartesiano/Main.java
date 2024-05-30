package planoCartesiano;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//Saber em qual quadrante as cordenadas passadas se encaixam;
		
		int X = 1;
		int Y = 1;
		 
		while (X != 0) {
			while (Y != 0) {
				System.out.print("Digite as cordenadas (X, Y):  ");
				X = sc.nextInt();
				Y = sc.nextInt();
				
				if (X > 0 ) {
					if (Y > 0) {
						System.out.println("Ambos possitivo: Quadrante 1.\n");
					}
					else {
						System.out.println("X positivo e Y negativo: Quadrante 4.\n");
					}
				}
				
				else {
					if (Y > 0) {
						System.out.println("X negativo e Y positivo: Quadrante 2.\n");
					}
					else {
						System.out.println("Ambos negativo: Quadrante 3.\n");
					}
				}
			}			
		}
		
		System.out.println("Raiz digitada (0). Fim do programa!");
		
		sc.close();	

	}
}
