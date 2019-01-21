package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class TestAccount {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(1, "Prachit", 2000);
		CurrentAccount currentAccount = new CurrentAccount(2, "Vinod", 1000);
		savingAccount.deposit(500);
		savingAccount.withdraw(600);

		currentAccount.deposit(2000);
		currentAccount.withdraw(1500);
		currentAccount.withdraw(3000);
		
		printDetails(savingAccount);
		printDetails(currentAccount);

	}

	public static void printDetails(Account account) {
		System.out.println("Account Number:" + account.getAccountNumber() +
				"\nName:" + account.getName() + "\nBalance:"+ account.getBalance());
	}

}
