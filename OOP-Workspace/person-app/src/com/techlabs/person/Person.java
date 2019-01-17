package com.techlabs.person;

public class Person {
	private String name;
	private int age;
	private GenderOptions gender;
	private int height;
	private float weight;

	public Person(String name, int age, GenderOptions gender, int height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderOptions getGender() {
		return gender;
	}

	public int getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void eat() {
		weight = weight + ((2 / weight) * 100);
	}

	public void workout() {
		weight = weight - ((3 / weight) * 100);
	}

	public float bmiScore() {
		return ((weight * 703) / (height * height));
	}

	public String bmiCategory() {
		if (this.getGender() == GenderOptions.MALE && this.bmiScore() < 18) {
			return ("Under Weight");
		}
		if (this.getGender() == GenderOptions.MALE && (this.bmiScore() >= 18 && this.bmiScore() < 25)) {
			return ("Normal Weight.");
		}
		if (this.getGender() == GenderOptions.MALE && this.bmiScore() >= 25) {
			return ("Over Weight.");
		}

		if (this.getGender() == GenderOptions.FEMALE && this.bmiScore() < 16) {
			return ("Under Weight");
		}
		if (this.getGender() == GenderOptions.FEMALE && this.bmiScore() >= 16 && this.bmiScore() < 22) {
			return ("Normal Weight.");
		}
		if (this.getGender() == GenderOptions.FEMALE && this.bmiScore() >= 22) {
			return ("Over Weight.");
		} else {
			return "Normal";
		}

	}

}
