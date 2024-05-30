package entities;

public class Bank {
	
	private int num;
	private String nomeTitular;
	private double saldo;
	
	public Bank(int num, String nomeTitular, double depositoInicial) {
		this.num = num;
		this.nomeTitular = nomeTitular;
		deposit(depositoInicial);
	}
	
	public Bank(int num, String nomeTitular) {
		this.num = num;
		this.nomeTitular = nomeTitular;
	}

	public int getNum() {
		return num;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposit(double value) {
		this.saldo += value;
	}
	
	public void withdrawing(double value) {
		this.saldo = (this.saldo - 5) - value;
	}
	
	public String dados() {
		return String.format("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
				+ "Account data: \n"
				+ "Holder name: %s,"
				+ " Account number: %d,"
				+ " Account balance: R$ %.2f", this.getNomeTitular(), this.getNum(), this.getSaldo());
	}

}
