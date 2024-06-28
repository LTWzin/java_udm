package entities;

public class LegalPerson extends Taxpayer{
	
	private Integer employeeNumber;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public Double tax() {
		if (employeeNumber > 10	) {
			return super.anualIncome * 0.14;
		}
		else {
			return super.anualIncome * 0.16;
		}
	}
}
