package entities;

public class Data {
	
	private String name;
	private Integer id;
	private Double salary;
	
	public Data() {
		
	}
	
	public Data(Integer id, String name, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	
	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		this.salary += this.salary * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, R$ %.2f;", id, name, salary);
	}
	
}

