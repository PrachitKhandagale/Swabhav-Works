package com.techlabs.observer;

public class EmailListener implements IAccountListener{

	@Override
	public void balanceChange(Account account) {
		System.out.println("\nEmail:\nAccount number:"+account.getAccountNumber()+"\n"
				+account.getName()+" your balance is "+account.getBalance());
	}
}
