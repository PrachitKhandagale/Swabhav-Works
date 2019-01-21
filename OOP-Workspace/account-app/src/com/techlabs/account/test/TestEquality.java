package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestEquality {

	public static void main(String[] args) {
		Account account = new Account("Ajay");
		Account account1 = new Account("Ajay");
		System.out.println(account==account);
		System.out.println(account.equals(account));
		System.out.println(account==account1);
		System.out.println(account.equals(account1));
	}
}
