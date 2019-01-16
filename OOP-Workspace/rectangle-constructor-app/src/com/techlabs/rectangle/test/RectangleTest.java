package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5, "foo");
		System.out.println(rectangle.calculateArea());
		System.out.println(new Rectangle(5, 5).calculateArea());
		printDetails(rectangle);
		printDetails(new Rectangle(10, 10, "RED"));
		printDetails(new Rectangle(13, 4, "White"));
	}

	public static void printDetails(Rectangle rectangle) {
		System.out.println("Height:" + rectangle.getHeight() + "\tWidth:" + rectangle.getWidth()
				+ "\tArea Of Rectangle:" + rectangle.calculateArea() 
				+"\tBackGround Color:" + rectangle.getBgColor());
	}
}
