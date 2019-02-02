package com.techlabs.strategic;

public class MathOperations {
	private IOperations strategy;

	public MathOperations(IOperations strategy) {
		this.strategy = strategy;
	}

	public int executeOperations(int num1, int num2) {
		return strategy.doMathOperation(num1, num2);
	}

}
