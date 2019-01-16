package com.techlabs.staticfinal.test;

public class StaticFinalTest {
	
	public final String FIRST_NAME;
	public static final String LAST_NAME = "Khandagale";
	
	public StaticFinalTest(String str) {
		FIRST_NAME = str;
	}

	public static void main(String[] args) {
		StaticFinalTest obj = new StaticFinalTest(args[0]);
		System.out.println(LAST_NAME);
	}

}
