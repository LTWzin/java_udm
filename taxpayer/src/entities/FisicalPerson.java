package entities;

public class FisicalPerson extends Taxpayer{
	
	private Double healthSpending;
	
	public FisicalPerson() {
		super();
	}

	public FisicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		if (super.anualIncome < 20000) {
			return (super.anualIncome * 0.15) - (healthSpending * 0.5);
		}
		
		else {	
			return (super.anualIncome * 0.25) - (healthSpending * 0.5);
		}
	}		
}
