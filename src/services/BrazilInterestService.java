package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

	private Double interestRate;
	
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}
	
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("The months must greater than zero");
		}
		return amount * Math.pow(1 + interestRate / 100.0, months);
	}
}
