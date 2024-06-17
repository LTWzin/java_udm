package application;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		
		Account account = new Account(1001, "Alex", 0.0);
		BusinessAccount bAccount = new BusinessAccount(1002, "Juan", 1200.0 , 1200.0);
		
		account.deposit(1000.0);
		System.out.println(account);
		account.withdraw(200.0);
		System.out.println(account.getBalance());
		
		System.out.println(bAccount);
		bAccount.deposit(100.0);
		bAccount.withdraw(300.0);
		bAccount.loan(1100.0);
		bAccount.loan(3000.0);
		System.out.println(bAccount);
		
		// UPCASTING
		
		Account acc1 = bAccount;
		
		Account acc2 = new BusinessAccount(1003, "Alex", 1000.0, 1200.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance()); // SOBREPOSIÇÃO
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2; 
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; Error de execução
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(300.0);
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			
		}
	}
}
