package com.techlabs.calculate.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.techlabs.calculate.Calculator;

class CalculatorTest {

	@Test
	public void testForPositiveEvenNumber()throws Exception {
		long num=2;
		Calculator calculator=new Calculator();
		long expected=8;
		long actual=calculator.cubeEven(num);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testForNegativeEvenNumber()throws Exception {
		long num=-4;
		Calculator calculator=new Calculator();
		long expected=-64;
		long actual=calculator.cubeEven(num);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testForZero()throws Exception {
		long num=0;
		Calculator calculator=new Calculator();
		long expected=0;
		long actual=calculator.cubeEven(num);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testForPositiveOddNumber()throws Exception {
		long num=5;
		Calculator calculator=new Calculator();
		//long expected=125;
		
		//assertEquals(expected, actual);
		assertThrows(Exception.class, ()->calculator.cubeEven(num));
	}

}
