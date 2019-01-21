package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("Prachit", 400.00);
		account.deposit(4000.00);
		account.withdraw(2000.00);
		account.withdraw(300.0);
		account.withdraw(2000.0);

		Account account2 = new Account("Ajay", 600.00);
		account2.deposit(800.00);
		account2.withdraw(200.00);

		Account account3 = new Account("Vinod");
		account3.deposit(600);
		account3.deposit(200);
		account3.withdraw(500);

		printDetails(account);
		printDetails(account2);
		printDetails(account3);
	}

	public static void printDetails(Account account) {
		System.out.println("Account Number : " + account.getAccountNumber() + "\nName : " 
				+ account.getName()+ "\nBalance : " + account.getBalance() +
				"\nThank You for Transaction.\n");
	}

}
