package com.techlabs.array;

public class TestIntegerArray {

	public static void main(String[] args) {
		int no=10;
		changeToZero(no);
		System.out.println(no);
		int[] nos= {10,20,30};
		changeToZero(nos);
		for(int number:nos)
		{
			System.out.println(number);
		}
	}
	static void changeToZero(int no)
	{
		no=0;
	}
	static void changeToZero(int[] nos)
	{
		for(int i=0;i<nos.length;i++)
		{
			nos[i]=0;
		}
	}
}
