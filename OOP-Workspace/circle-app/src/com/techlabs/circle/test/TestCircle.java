package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(4.6f);
		System.out.println("Radius of Circle:" + circle.getRadius());
		System.out.println("Area of Circle :" + circle.calculateArea());
		System.out.println("Area of Parameter :" + circle.calculateParameter());

	}

}
