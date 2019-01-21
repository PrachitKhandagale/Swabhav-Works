package com.techlabs.account;

public class Account implements Cloneable {
	private int accountNumber;
	private String name;
	private double balance;
	private static int nextAccountNumber;
	static {
		nextAccountNumber = 1;
	}

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	public Account(String name) {
		this(name, 500);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if ((balance - amount) <= 500) {
			System.out.println("Sorry transaction can not be done as balance is getting less than 500.");
		}
		balance = balance - amount;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nName:"+this.getName()+"\nBalance:"+this.getBalance()+
				"\nAccount Number:"+this.accountNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account account=(Account)obj;
		if(this.getName()==account.getName() && this.getBalance()==account.getBalance()) {
			return true;
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
