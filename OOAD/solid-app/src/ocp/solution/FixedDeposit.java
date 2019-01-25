package ocp.solution;

import ocp.violation.FestivalType;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private IFestivalRateCalculation festivalType;
	private int year;

	public FixedDeposit(int accountNumber, String name, double principal, int year,
			IFestivalRateCalculation festivalType) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.year = year;
		this.festivalType=festivalType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getYear() {
		return year;
	}

	public double calculateSimpleInterest() {
		return principal * year * festivalType.calculateRate();
	}
}
