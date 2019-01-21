package com.techlabs.account;

public class SavingAccount extends Account {
	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if ((balance - amount) <= 1000) {
			System.out.println("Sorry transaction can not be done as balance is getting less than 1000.");
		}
		balance = balance - amount;
	}

}
