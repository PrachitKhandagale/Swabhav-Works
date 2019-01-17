package com.techlabs.customexceptio;

public class EvenOddException extends Exception {
	EvenOddException() 
	{
		super("The number is odd please try even number.");
	}

}
