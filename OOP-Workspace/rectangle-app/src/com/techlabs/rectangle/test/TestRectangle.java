package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		rect.setHeight(5);
		rect.setWidth(10);
		System.out.println("Height of rectangle :"+rect.getHeight());
		System.out.println("Height of rectangle :"+rect.getWidth());
		System.out.println("Area of Rectangle is:"+rect.calculateArea());
	}
}