package com.techlabs.demoevenodd;

public class PrintEvenOdd {

	public static void main(String[] args) {
		System.out.println("Even Number:");
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Odd Number:");
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
