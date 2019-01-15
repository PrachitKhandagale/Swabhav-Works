package com.techlabs.printnumber;

public class PrintEvenOdd {
	private int range=100;
	

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void printEven() {
		System.out.println("Even Number:");
		for (int i = 0; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

	public void printOdd() {
		System.out.println();
		System.out.println("Odd Number:");
		for (int i = 0; i <= range; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
