package com.techlabs.rectangle.color.test;

import com.techlabs.rectangle.color.ColorOptions;
import com.techlabs.rectangle.color.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(4,5,ColorOptions.BLUE);
		printDetails(rect);
		printDetails(new Rectangle(6,7,ColorOptions.RED));
		
	}
	
	public static void printDetails(Rectangle rectangle) {
		System.out.println("Height:"+rectangle.getHeight()+"\nWidth:"+rectangle.getWidth()
		+"\nArea:"+rectangle.calculateArea()+"\nBackGround Color:"+rectangle.getBgColor());
	}
}