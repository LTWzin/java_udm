package entities;

public class Rental {

	private String name;
	private String email;
	private int room;
	
	public Rental(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return String.format("%d: %s, %s", room, name, email);
	}
	
}