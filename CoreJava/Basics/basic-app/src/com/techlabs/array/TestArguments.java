package com.techlabs.array;

public class TestArguments {

	public static void main(String[] names) {
		System.out.println(names.length);
		if (names.length != 0) {
			
			for(String name:names) {
				System.out.println("Hello " + name);
			}

		} else {
			System.out.println("please enter the names");
		}
		System.out.println("Thank You.");
	}

}
