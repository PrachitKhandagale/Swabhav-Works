package com.techlabs.account.exception;

import com.techlabs.account.Account;

public class InsufficientFundException extends RuntimeException{
	
	public InsufficientFundException(Account account,double amount) {
		super("Account Number:"+account.getAccountNumber()+"\nName:"+account.getName()+
				" is have balance "+account.getBalance()+". withdrawing amount "+amount+
				" is not possible.\nPlease Enter another amount to withdraw.");
		
	}
}
