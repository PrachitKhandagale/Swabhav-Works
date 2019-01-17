package com.techlabs.customexceptio;

public class CustException {
	public void checkEvenOdd(int num) throws Exception
	{
		if(num%2==0)
		{
			System.out.println("Even number.");
		}
		else
		{
			throw new EvenOddException();
		}
	}

}
