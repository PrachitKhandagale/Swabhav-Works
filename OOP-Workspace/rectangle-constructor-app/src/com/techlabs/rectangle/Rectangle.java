package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String bgColor = "Blue";
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}

	public Rectangle(int width, int height, String bgColor) {
		this.width = width;
		this.height = height;
		if (bgColor.equalsIgnoreCase("Blue") || bgColor.equalsIgnoreCase("Red") || bgColor.equalsIgnoreCase("Green")) {
			this.bgColor = bgColor.toLowerCase();
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getBgColor() {
		return bgColor;
	}

	public int calculateArea() {
		return width * height;
	}

}
