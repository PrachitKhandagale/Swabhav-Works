package com.techlabs.observer;

public class SmsListener implements IAccountListener{

	@Override
	public void balanceChange(Account account) {
		System.out.println("\nSMS:\nYour currect balance is:"+account.getBalance());
	}
}
