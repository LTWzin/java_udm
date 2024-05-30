package entities;

public class CurrencyConverter {
	
	public double cotacao;
	public double dollars;
	
	public double conversao() {
		return dollars * cotacao * 1.06; 
		
	}
	
}
