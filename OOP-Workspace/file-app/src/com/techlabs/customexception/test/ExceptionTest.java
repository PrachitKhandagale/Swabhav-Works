package com.techlabs.customexception.test;

import com.techlabs.customexceptio.CustException;

public class ExceptionTest {

	public static void main(String[] args)throws Exception {
		CustException ce=new CustException();
		ce.checkEvenOdd(11);
	}

}
