package entities;

public class productData {
	
	private String name;
	private double price;
	private int quantity;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public productData(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public productData(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
		
	}
	
	public void addStock(int products) {
		quantity += products;
	}
	
	public void removeStock(int products) {
		quantity -= products;
	}
}