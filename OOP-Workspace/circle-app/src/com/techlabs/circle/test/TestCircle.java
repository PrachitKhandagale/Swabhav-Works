package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class TestCircle {

	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.setRadius(4.6f);
//		System.out.println("Radius of Circle:" + circle.getRadius());
//		System.out.println("Area of Circle :" + circle.calculateArea());
//		System.out.println("Area of Parameter :" + circle.calculateParameter());

		Circle smallCircle = new Circle();
		smallCircle.setRadius(1.5f);
//		System.out.println("Radius of Small Circle :" + smallCircle.getRadius()+
//				"\nArea of Small Circle :" + smallCircle.calculateArea()+
//				"\nArea of Small Parameter :" + smallCircle.calculateParameter()+"\n");
//		
		Circle bigCircle = new Circle();
		bigCircle.setRadius(5.5f);
//		System.out.println("Radius of Big Circle :" + bigCircle.getRadius()+
//				"\nArea of Big Circle :" + bigCircle.calculateArea()+
//				"\nArea of Big Parameter :" + bigCircle.calculateParameter());	
		printDetails(smallCircle);
		System.out.println();
		printDetails(bigCircle);
		
		Circle temp=bigCircle;
		temp.setRadius(2.0f);
		System.out.println(temp.getRadius());
		System.out.println(bigCircle.getRadius());
		temp=null;
		System.out.println(bigCircle.getRadius());
		//System.out.println(temp.getRadius());  // NullPointerException
		
		
		Circle[] arrayCircle=new Circle[3];
		Circle circle1=new Circle();
		circle1.setRadius(9.5f);
		arrayCircle[0]=circle1;
		
		Circle circle2=new Circle();
		circle2.setRadius(8.5f);
		arrayCircle[1]=circle2;
		
		Circle circle3=new Circle();
		circle3.setRadius(6.5f);
		arrayCircle[2]=circle3;
		
		//System.out.println(arrayCircle);
		
		Circle largeCircle=findBiggestCircle(arrayCircle);
		System.out.println("Bigger Radius:"+largeCircle.getRadius());
		printDetails(largeCircle);
		printDetails(arrayCircle);
		
		
	}
	
	private static void printDetails(Circle circle) {
		System.out.println("Radius of circle"+circle.getRadius()+"\nArea of Circle :"
				+ circle.calculateArea()+"\nArea of Parameter :" 
				+ circle.calculateParameter());
		System.out.println(circle.hashCode());
	}
	
	private static void printDetails(Circle[] circle) {
		for(Circle circles:circle) {
			printDetails(circles);
		}
	}
	
	private static Circle findBiggestCircle(Circle[] arrayCircle) {
		
		int initial=0;
		for(int i=0;i<arrayCircle.length;i++) {
			if(arrayCircle[initial].getRadius()<arrayCircle[i].getRadius()) {
				initial=i;
			}
		}
		return arrayCircle[initial];
	}

}
