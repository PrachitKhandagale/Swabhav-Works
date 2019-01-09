package com.techlabs.basic;

import java.util.Arrays;

public class TestOverload {

	public static void main(String[] args) {
		System.out.println(true);
		System.out.println('a');
		System.out.println(2.3);
		System.out.println("abc");
		System.out.println(15);
		
		System.out.print(false);
		System.out.print('P');
		System.out.print(5.5);
		System.out.print(56);
		System.out.println("Prachit");
		
		printThis("Hello World!!");
		printThis(10);
		printThis(10.57);
		printThis(10.5f);
		printThis(true);
		printThis('#');
		
		int[] array= {12,14,15,65,43,87};
		printThis(array);
	}
	private static void printThis(String passString)
	{
		System.out.println(passString);
		System.out.println("This is String Overload.");
	}
	private static void printThis(int number)
	{
		System.out.println(number);
		System.out.println("This is Int Overload.");
	}
	private static void printThis(double numberDbl)
	{
		System.out.println(numberDbl);
		System.out.println("This is Double Overload.");
	}
	private static void printThis(float floatNum)
	{
		System.out.println(floatNum);
		System.out.println("This is Float Overload.");
	}
	private static void printThis(boolean bool)
	{
		System.out.println(bool);
		System.out.println("This is Boolean Overload.");
	}
	private static void printThis(char word)
	{
		System.out.println(word);
		System.out.println("This is Character Overload.");
	}
	private static void printThis(int[] array)
	{
		System.out.println(Arrays.toString(array));
		System.out.println("This is Array Overload.");
		
	}

}
