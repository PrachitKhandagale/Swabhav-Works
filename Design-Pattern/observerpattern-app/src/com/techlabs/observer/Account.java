package com.techlabs.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<IAccountListener> listenerList = new ArrayList<IAccountListener>();

	public Account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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

	public List<IAccountListener> getListenerList() {
		return listenerList;
	}

	public void registerListener(IAccountListener accountListner) {
		listenerList.add(accountListner);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		notifyingListner();
	}

	public void deposit(double amount) {
		balance = balance + amount;
		notifyingListner();
	}

	public void notifyingListner() {
		for (IAccountListener accountListener : listenerList) {
			accountListener.balanceChange(this);
		}

	}

}
