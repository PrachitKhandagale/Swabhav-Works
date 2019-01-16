package com.techlabs.staticfinal.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionOfClass {
	private String simple;

	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	public ReflectionOfClass() {
		simple = "GeeksforGeeks";
	}

	public void method1() {
		System.out.println("The string is " + simple);
	}

	public void method1(int x) {
		System.out.println("The string is " + simple);
	}

	public void method1(double y) {
		System.out.println("The string is " + simple);
	}

	public void method2(int n) {
		System.out.println("The number is " + n);
	}

	private void method3() {
		System.out.println("Private method invoked");
	}

	public void printCountMethods(Method[] method) {
		System.out.println("Count of methods:" + method.length);
	}

	public void printNameOfMethods(Method[] nameMethod) {
		System.out.println("The public methods of class are : ");

		for (Method myMethod : nameMethod) {
			System.out.println("method=" + myMethod.getName());
		}
	}

	public void printCountConstructor(Constructor<?>[] constructor) {
		System.out.println("Number of Constructor:" + constructor.length);
	}

	public void printNameOfConstructor(Constructor<?>[] nameConstructor) {

		for (Constructor<?> construt : nameConstructor) {
			System.out.println("Constructor=" + construt.getName());
		}
	}

	public void printCountGetter(Method[] getMethod) {
		int getCount = 0;
		for (int i = 0; i < getMethod.length; i++) {
			if (getMethod[i].getName().startsWith("get")) {
				getCount++;
			}
		}
		System.out.println("Number of Getter:" + getCount);
	}

	public void printCountSetter(Method[] setMethod) {
		int setCount = 0;
		for (int i = 0; i < setMethod.length; i++) {
			if (setMethod[i].getName().startsWith("set")) {
				setCount++;
			}
		}
		System.out.println("Number of Setter:" + setCount);
	}

	public void printNameOfGetter(Method[] nameGetMethod) {
		for (int i = 0; i < nameGetMethod.length; i++) {
			if (nameGetMethod[i].getName().startsWith("get")) {
				System.out.println("Name of Getter:" + nameGetMethod[i]);
			}
		}

	}

	public void printNameOfSetter(Method[] nameSetMethod) {
		for (int i = 0; i < nameSetMethod.length; i++) {
			if (nameSetMethod[i].getName().startsWith("set")) {
				System.out.println("Name of Setter:" + nameSetMethod[i]);
			}
		}

	}

}
