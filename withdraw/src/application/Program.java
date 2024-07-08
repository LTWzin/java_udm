package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.exceptions.WithdrawLimitException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();	
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.printf("New balance : $ %.2f", account.getBalance());
		
		}
		catch (WithdrawLimitException e ) {
			System.out.println("Withdraw error: " + e.getMessage());	
		}
		catch (InputMismatchException e) {
			System.out.println("Input error: The value entered is invalid.");
		}
		
		finally {
		sc.close();
		}
	}
}
