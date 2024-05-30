package Fatorial;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 1;
		
		System.out.println("Digite um numero inteiro para ver o fatorial:");
		int X = sc.nextInt();
		
		for (int c = 1; c <= X; c += 1 ) {
			
			total = total * c;
			
		}
		
		System.out.println(total);
		
		sc.close();
	}
}
