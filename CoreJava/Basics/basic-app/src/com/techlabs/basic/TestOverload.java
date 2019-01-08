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
	private static void printThis(String s)
	{
		System.out.println(s);
		System.out.println("This is String Overload.");
	}
	private static void printThis(int n)
	{
		System.out.println(n);
		System.out.println("This is Int Overload.");
	}
	private static void printThis(double d)
	{
		System.out.println(d);
		System.out.println("This is Double Overload.");
	}
	private static void printThis(float f)
	{
		System.out.println(f);
		System.out.println("This is Float Overload.");
	}
	private static void printThis(boolean b)
	{
		System.out.println(b);
		System.out.println("This is Boolean Overload.");
	}
	private static void printThis(char c)
	{
		System.out.println(c);
		System.out.println("This is Character Overload.");
	}
	private static void printThis(int[] arr)
	{
		System.out.println(Arrays.toString(arr));
		System.out.println("This is Array Overload.");
		
	}

}
