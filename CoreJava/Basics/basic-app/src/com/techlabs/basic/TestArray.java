package com.techlabs.basic;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		//int[] array={3,5,7,9,4,2,54,67,5};
		int[] array=new int[6];
		array[0]=101;
		array[1]=102;
		array[2]=103;
		array[3]=104;
		array[4]=105;
		array[5]=106;
		
		//System.out.println(Arrays.toString(arr));
		for(int number:array)
		{
			System.out.print(number+" ");
		}
		array[3]=60;
		System.out.println();
		for(int number:array)
		{
			System.out.print(number+" ");
		}
		
		int size, number, delet, count=0;
	       
	       Scanner scan = new Scanner(System.in);
		  
		   
	       System.out.println("\nEnter Element to be Delete : ");
	       delet = scan.nextInt();
	       for(number=0; number<array.length-1; number++)
	       {
	           if(array[number] == delet)
	           {
	               for(int j=number; j<((array.length)-1); j++)
	               {
	                   array[j] = array[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	       if(count==0)
	       {
	           System.out.print("Element Not Found..!!");
	       }
	       else
	       {
	           System.out.print("Element Deleted Successfully..!!");
	           System.out.print("\nNow the New Array is :\n");
	           for(number=0; number<(array.length-1); number++)
	           {
	               System.out.print(array[number]+ " ");
	           }
	       }
		
	}

}
