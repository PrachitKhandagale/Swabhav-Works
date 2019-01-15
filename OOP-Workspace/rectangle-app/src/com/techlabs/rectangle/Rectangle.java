package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;

	public int correctDimension(int var) {
		if (var <= 0) {
			return 1;
		}
		if (var > 100) {
			return 100;
		}
		return var;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = correctDimension(height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = correctDimension(width);
	}

	public int calculateArea() {
		int area = 0;
		area = height * width;
		return area;
	}
}
