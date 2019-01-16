package com.techlabs.staticfinal.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RefelctionOfClassTest {

	public static void main(String[] args) throws Exception {
//		ReflectionOfClass obj = new ReflectionOfClass();
//		//String obj = "Prachit";
//		// int count = 0;
//		int countConstructor = 0;
//		Class<?> cls = obj.getClass();
//		System.out.println("The name of class is " + cls.getName());
//		Constructor[] constructor = cls.getConstructors();
//		for (Constructor construt : constructor) {
//			System.out.println("Constructor is:" + construt.getName());
//			countConstructor++;
//		}
//		System.out.println("Number of Constructor:" + countConstructor);
//		System.out.println("The public methods of class are : ");
//		Method[] methods = cls.getMethods();
//
//		int len = methods.length;
//		System.out.println("Count of methods:" + len);
//		for (Method method : methods) {
//			System.out.println("method=" + method.getName());
//			// count++;
//		}
//		// System.out.println("Method numbers:" + count);
//
//		int getCount = 0;
//		int setCount = 0;
//		for (int i = 0; i < methods.length; i++) {
//			if (methods[i].getName().startsWith("get")) {
//				getCount++;
//			}
//			if (methods[i].getName().startsWith("set")) {
//				setCount++;
//			}
//		}
//		System.out.println("Getter and setter numbers:" + getCount + " " + setCount);
//
//		Class<?> c = Object.class;
//		Object obj1 = new String();
//		c = obj1.getClass();
//		System.out.println(c.getName());
		
		ReflectionOfClass roc=new ReflectionOfClass();
		
		Constructor<?>[] constructor=ReflectionOfClass.class.getConstructors();
		Method[] method=ReflectionOfClass.class.getMethods();
		//Class<?> cls=roc.getClass();
		//Method[] method=cls.getMethods();
		System.out.println("Methods Count and Name:");
		roc.printCountMethods(method);
		roc.printNameOfMethods(method);
		
		System.out.println("\nConstructors Count and Name:");
		
		//Constructor<?>[] constructor=cls.getConstructors();
		roc.printCountConstructor(constructor);
		roc.printNameOfConstructor(constructor);
		
		System.out.println("\nGetter and Setter Methods Count:");
		
		roc.printCountGetter(method);
		roc.printCountSetter(method);
		
		System.out.println("\nGetter and Setter Methods Names:");
		
		roc.printNameOfGetter(method);
		roc.printNameOfSetter(method);
		

	}

}
