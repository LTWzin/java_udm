package entities;

import entities.Product.Product;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.price = price;
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return getProduct().getName() + ", $" +
				String.format("%.2f", getProduct().getPrice())
				 + ", Quantity: " +
				getQuantity() + ", Subtotal: $" +
				String.format("%.2f", subTotal());
	}
}
