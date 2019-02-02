package com.techlabs.singleton;

public class TestBasicMath {
	
	public static void main(String[] args) {
		BasicMath basicMath=BasicMath.getInstance();
		System.out.println(basicMath.add(2,3));
		System.out.println(basicMath);
		addition();
	}
	
	public static void addition() {
		BasicMath basicMath=BasicMath.getInstance();
		System.out.println(basicMath.add(12,13));
		System.out.println(basicMath);
	}

}
