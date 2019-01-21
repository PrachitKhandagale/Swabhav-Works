package com.techlabs.collection.boxing;

public class Boxing {

	public static void main(String[] args) {
		int a = 50;
		Integer a1 = new Integer(a);// Boxing
		System.out.println("value of a1:"+a1);
		int a2=a1.intValue();//unboxing
		System.out.println("value of a2:"+a2);
		char c='a';
        Character character = c; //Autoboxing of char 
        char ch = character; // Auto-unboxing of Character 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of character: " + character); 
	}
}
