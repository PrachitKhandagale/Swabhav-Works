package com.techlabs.calculate;

public class Calculator {
	public long cubeEven(long number)throws Exception {
		if(number%2==0) {
			return number*number*number;
		}else {
			throw new Exception("Odd number passed.");
		}
	}

}
