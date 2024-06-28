package entities;

public abstract class Taxpayer {
	
	protected String name;
	protected Double anualIncome;
	
	public Taxpayer() {
		
	}

	public Taxpayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return anualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.anualIncome = annualIncome;
	}
	
	public abstract Double tax();

}
