package com.techlabs.basic;

public class TestImmutableString {

	public static void main(String[] args) {
		String string="Hello world";
		System.out.println(string);
		System.out.println(string.hashCode());
		string = string+" world";
		System.out.println(string);
		System.out.println(string.hashCode());
		
	}

}
