package com.techlabs.persontest;

import com.techlabs.person.GenderOptions;
import com.techlabs.person.Person;

public class PersonTest {
	public static void main(String args[]) {
		Person person = new Person("Prachit", 19, GenderOptions.MALE, 44, 54.4f);
		Person person1 = new Person("Prachita", 21, GenderOptions.FEMALE, 41, 54.4f);
		Person person2 = new Person("Ramesh", 28, GenderOptions.OTHER, 49, 64.4f);
		person.eat();
		person.eat();
		person.workout();
		person.workout();
		person1.workout();
		System.out.println("BMI for male:" + person.bmiScore());
		System.out.println("BMI for female:" + person1.bmiScore());
		System.out.println("BMI for other:" + person2.bmiScore());
		System.out.println("BMI Category for male:" + person.bmiCategory());
		System.out.println("BMI Category for female:" + person1.bmiCategory());
		System.out.println("BMI Category for Other:" + person2.bmiCategory());
		printDetails(person);
		printDetails(person1);
		printDetails(person2);

	}

	public static void printDetails(Person person) {
		System.out.println("Name:" + person.getName() + "\tAge:" + person.getAge() + 
				"\tGender:" + person.getGender() + "\tHeight:" + person.getHeight() +
				"\tWeight:" + person.getWeight());
	}

}
