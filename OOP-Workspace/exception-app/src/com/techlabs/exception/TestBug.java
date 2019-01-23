package com.techlabs.exception;

import java.io.FileNotFoundException;
import java.lang.*;

public class TestBug {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("Result is:" + c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Denominator should not be zero. Enter another value.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter arguments in array.");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter int value in argument.");
		}
		System.out.println("Thank you.");
		// main(args);
	}
}
