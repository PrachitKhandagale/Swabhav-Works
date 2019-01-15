package com.techlabs.circle;

public class Circle {
	private float radius;
	private final static float PI = 3.14f;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		if (radius <= 0.0f) {
			radius = 1f;
		}
		this.radius = radius;
	}

	public float calculateArea() {
		return PI * radius * radius;
	}

	public float calculateParameter() {
		return 2 * PI * radius;
	}

}
