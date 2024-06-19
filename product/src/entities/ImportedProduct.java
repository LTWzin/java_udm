package entities;

public class ImportedProduct extends Product {
	
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return super.price + customFee;
	}
	
	@Override
	public final String priceTag() {
		return String.format("%s - $%.2f (Custom fee: $%.2f)", super.name, totalPrice(), customFee);
	}
}
