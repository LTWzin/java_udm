package aplication;
import java.util.Scanner;
import java.util.Locale;
import entities.client;

public class program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		client client;
		
		double balance = 0;
		
// Create account
		System.out.print("Digite o numero da conta:  ");
		int accountNumber = sc.nextInt();
		System.out.print("Digite o nome do dono da conta:  ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Deseja realizar um deposito inicial? [S/N]  ");
		
		char depositoInicial = sc.next().toUpperCase().charAt(0);
		
		if (depositoInicial == 'S') {
			System.out.print("Digite o valor do deposito inicial:  ");
			 balance = sc.nextDouble();
			 client = new client(accountNumber, name, balance);
			 
			 System.out.println("Dados da conta:");
				System.out.printf("CONTA %.0f,"
						+ " DONO: %s,"
						+ " SALDO TOTAL: R$ %.2f"
						+ " ", client.getAccountNumber(), client.getName(), client.getBalance());
		}
		else {
			client = new client(accountNumber, name);
			
			System.out.println("Dados da conta:");
			System.out.printf("CONTA %.0f, "
					+ "DONO: %s, "
					+ "SALDO TOTAL: R$ %.2f"
					+ " ", client.getAccountNumber(), client.getName(), client.getBalance());
		}
		
// Deposit
		System.out.println("\n");
		System.out.print("Digite o valor a ser depositado na conta: ");
		double deposit = sc.nextDouble();
		client.deposito(deposit);
		
		System.out.println("Dados da conta atualizada:");
		System.out.printf("CONTA %.0f, "
				+ "DONO: %s, "
				+ "SALDO TOTAL: R$ %.2f"
				+ " ", client.getAccountNumber(), client.getName(), client.getBalance());
		
// withdraw
		System.out.println("\n");
		System.out.print("Digite um valor a ser sacado da sua conta: ");
		double withdraw = sc.nextDouble();
		client.saque(withdraw);
		
		System.out.println("Dados da conta atualizada:");
		System.out.printf("CONTA %.0f, "
				+ "DONO: %s, "
				+ "SALDO TOTAL: R$ %.2f"
				+ " ", client.getAccountNumber(), client.getName(), client.getBalance());
		
		sc.close();
	}
}
