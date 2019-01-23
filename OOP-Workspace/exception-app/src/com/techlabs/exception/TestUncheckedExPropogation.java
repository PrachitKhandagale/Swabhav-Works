package com.techlabs.exception;

public class TestUncheckedExPropogation {

	public static void main(String[] args) {
		try {
		f1();
		System.out.println("End main");
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
	}

	public static void f1() {
		System.out.println("Inside f1 ");
		f2();
	}

	public static void f2() {
		System.out.println("Inside f2");
		f3();
	}

	public static void f3() {
		System.out.println("Inside f3");
		throw new RuntimeException("f3 Error");
	}

}
