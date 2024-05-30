package entities;

public class CurrencyConverter {
	
	public static final double TAX = 1.06;
	
	public static final double conversion(double price, double quantity) {
		return (price * TAX) * quantity;
	}
	
}
