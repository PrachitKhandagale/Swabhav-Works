package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.exception.InsufficientFundException;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("Prachit", 400.00);
		try {
			account.deposit(4000.00);
			account.withdraw(2000.0);
			account.withdraw(2000.0);

			printDetails(account);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void printDetails(Account account) {
		System.out.println("Account Number : " + account.getAccountNumber() + "\nName : " + account.getName()
				+ "\nBalance : " + account.getBalance() + "\nThank You for Transaction.\n");
	}
}
