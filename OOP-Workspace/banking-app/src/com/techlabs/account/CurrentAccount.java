package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if ((balance - amount) <= (-2000)) {
			System.out.println("Sorry transaction can not be done as balance is getting less than -2000.");
		}
		balance = balance - amount;
	}
}
