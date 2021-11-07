package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("The months must greater than zero");
		}
		return amount * Math.pow(1 + getInterestRate() / 100.0, months);
	}
}
