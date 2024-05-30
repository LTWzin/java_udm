package senha;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2023;
		
		System.out.println("Digite a senha (PIN): ");
		int tentativa = sc.nextInt();
		
		while (tentativa != senha) {
			System.out.println("Senha Incorreta, tente novamente:");
			tentativa = sc.nextInt();
		}
		System.out.println("Senha correta! Acesso permitido.");
		
		sc.close();
	}

}
