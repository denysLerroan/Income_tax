package entities;

public class LegalPerson extends TaxPayer {

	private Integer employeeNumbers;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double anualIncome, Integer employeeNumbers) {
		super(name, anualIncome);
		this.employeeNumbers = employeeNumbers;
	}

	public Integer getEmployeeNumbers() {
		return employeeNumbers;
	}

	public void setEmployeeNumbers(Integer employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}

	// Solucao melhorada do professor 
	@Override
	public double tax() {
		if (employeeNumbers <= 10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}

	}

}
