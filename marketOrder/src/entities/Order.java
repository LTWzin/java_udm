package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double orderTotal = 0 ;
		for (OrderItem x : items) {
			orderTotal += x.subTotal();
		}
		return orderTotal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-=ORDER SUMARY=-\nOrder moment: " + getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		sb.append("\nOrder status: " + getStatus()); 
		sb.append("\nClient: " + getClient().getName());
		sb.append(" (" + getClient().getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		sb.append(") - " + getClient().getEmail());
		sb.append("\nOrder items:\n");
		for (OrderItem x : items) {
			sb.append(" -" + x.toString());
			sb.append("\n");
		}
		sb.append(String.format("Total value: $%.2f", total()));
		return sb.toString();
	}
}
