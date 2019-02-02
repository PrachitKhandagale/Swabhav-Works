package com.techlabs.observer.test;

import com.techlabs.observer.Account;
import com.techlabs.observer.EmailListener;
import com.techlabs.observer.IAccountListener;
import com.techlabs.observer.SmsListener;

public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account(1, "Prachit", 2000);
		account.deposit(200);
		IAccountListener accountListner=new EmailListener();
		IAccountListener accountListner2=new SmsListener();
		account.registerListener(accountListner);
		account.registerListener(accountListner2);
		account.deposit(500);
		account.withdraw(200);
		
		Account account2=new Account(2,"Vinod",5000);
		account2.registerListener(accountListner);
		//account2.registerListener(accountListner2);
		account2.deposit(200);
	}
}
