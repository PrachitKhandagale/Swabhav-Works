package com.techlabs.rectangle.color;

public class Rectangle {
	private int width;
	private int height;
	private ColorOptions bgColor;
	
	public Rectangle(int width,int height,ColorOptions bgColor) {
		this.width=width;
		this.height=height;
		this.bgColor=bgColor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ColorOptions getBgColor() {
		return bgColor;
	}
	
	public int calculateArea() {
		return width*height;
	}
	
}
