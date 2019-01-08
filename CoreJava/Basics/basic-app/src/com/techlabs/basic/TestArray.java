package com.techlabs.basic;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		//int[] arr={3,5,7,9,4,2,54,67,5};
		int[] arr=new int[6];
		arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;
		arr[5]=106;
		
		//System.out.println(Arrays.toString(arr));
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		arr[3]=60;
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		int size, i, del, count=0;
	       
	       Scanner scan = new Scanner(System.in);
		  
		   
	       System.out.println("\nEnter Element to be Delete : ");
	       del = scan.nextInt();
	       for(i=0; i<arr.length-1; i++)
	       {
	           if(arr[i] == del)
	           {
	               for(int j=i; j<((arr.length)-1); j++)
	               {
	                   arr[j] = arr[j+1];
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
	           for(i=0; i<(arr.length-1); i++)
	           {
	               System.out.print(arr[i]+ " ");
	           }
	       }
		
	}

}
