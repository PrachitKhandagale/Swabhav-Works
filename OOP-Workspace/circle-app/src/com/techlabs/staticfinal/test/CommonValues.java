package com.techlabs.staticfinal.test;

public class CommonValues {
	public final String FIRST_NAME;
	public static final String LAST_NAME = "Khandagale";
	
	public CommonValues() {
		FIRST_NAME = "Prachit";
		//LAST_NAME = "Khandagale";
		System.out.println(FIRST_NAME);
	}
	public static void main(String[] args) {
		//StaticFinalTest obj = new StaticFinalTest(args[0]);
		System.out.println(LAST_NAME);
		CommonValues cm=new CommonValues();
		
	}

}
