package application;

import java.util.Scanner;
import entities.Bank;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String nomeTitular;
		double valor;
		
		Bank bank;
		
		System.out.print("Type the account number: ");
		num = sc.nextInt();
		System.out.print("Type the name of the account holder: ");
		nomeTitular = sc.next();
		System.out.printf("%s, would you like to make an inicial deposit? (Y/N): ", nomeTitular);
		String escolha = sc.next();
		if (escolha.charAt(0) == 'y' || escolha.charAt(0) == 'Y') { 
			System.out.println("Type the deposit value: ");
			valor = sc.nextDouble();
			bank = new Bank(num, nomeTitular, valor);
		}
		else {
			bank = new Bank(num, nomeTitular);
		}
		System.out.println(bank.dados());
		
		System.out.print("\nEnter a deposit value: ");
		valor = sc.nextDouble();
		bank.deposit(valor);
		System.out.println(bank.dados());

		System.out.print("\nEnter a withdraw value: ");
		valor = sc.nextDouble();
		bank.withdrawing(valor);
		System.out.println(bank.dados());
		
		sc.close();
	}
}	
