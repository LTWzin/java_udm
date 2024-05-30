package entities;

public class client {

// Attributes
	private int accountNumber;
	private String name;
	private double balance;

// Constructor
	public client(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposito(initialDeposit);
	}

	public client(int accountNumber, String name) {

		this.accountNumber = accountNumber;
		this.name = name;
}

// Gets and Sets
	public double getBalance() {
		return balance;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Methods
	public double deposito(double valor) {
		return balance += valor;

	}

	public double saque(double valor) {
		return balance -= (valor + 5);
	}

}
