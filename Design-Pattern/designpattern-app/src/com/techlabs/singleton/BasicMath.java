package com.techlabs.singleton;

public class BasicMath {
	private static BasicMath obj;
	
	private BasicMath() {
	}
	
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public static BasicMath getInstance() {
		if(obj==null) {
			obj=new BasicMath();
		}
		return obj;
	}
}
