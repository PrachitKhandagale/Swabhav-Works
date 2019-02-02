package com.techlabs.strategic;

public class TestStrategy {

	public static void main(String[] args) {
		MathOperations mathOperation = new MathOperations(new OperationAdd());
		System.out.println("50 + 25 = " + mathOperation.executeOperations(50, 25));

		mathOperation = new MathOperations(new OperationMultiply());
		System.out.println("16 * 5 = " + mathOperation.executeOperations(16, 5));
	}

}
