package entities;

public class PhysicalPerson extends TaxPayer {

	private Double healthSpendings;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double anualIncome, Double healthSpendings) {
		super(name, anualIncome);
		this.healthSpendings = healthSpendings;
	}

	public Double getHealthSpendings() {
		return healthSpendings;
	}

	public void setHealthSpendings(Double healthSpendings) {
		this.healthSpendings = healthSpendings;
	}

	// Solucao a ser melhorada do aluno
	@Override
	public double tax() {
		double tax = 0.0;
		if (getAnualIncome() > 20000) {
			tax = getAnualIncome() * 0.25;
			if (healthSpendings > 0) {
				tax -= (healthSpendings * 0.5);
			}

		} else {
			tax = getAnualIncome() * 0.15;
			if (healthSpendings > 0) {
				tax -= (healthSpendings * 0.15);
			}
		}
		return tax;
	}

}
