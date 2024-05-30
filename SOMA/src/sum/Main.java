package sum;

import java.util.Locale;	

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		String product = "motorcycle wheel";
		String product2 = "clutch cable";
		
		int age = 17;
		int code = 2023;
		char gender = 'U';	
		
		double price1 = 120.00;
		double price2 = 25.00;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		
		System.out.printf("Employee: %d years old, code %d, and gender: %s%n", age, code, gender);
		
		System.out.printf("Total value: $ %.2f", price1 + price2);
	}

}
