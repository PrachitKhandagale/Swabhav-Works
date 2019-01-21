package com.techlabs.foo.test;

import java.lang.reflect.Method;

import com.techlabs.foo.Foo;
import com.techlabs.foo.ProTestCase;

public class FooTest {
	public static void main(String[] args) throws Exception, IllegalArgumentException {
		int count = 0;
		Foo foo = new Foo();
		int passCount = 0;
		int failCount = 0;
		for (Method method : Foo.class.getDeclaredMethods()) {
			// printPassedDetails(method, foo);
			// printFailedDetails(method, foo);
			// count++;
			passCount = passCount + printPassedDetails(method, foo);
			failCount = failCount + printFailedDetails(method, foo);
		}
		System.out.println("Number of Passed methods:" + passCount);
		System.out.println("Number of Failed methods:" + failCount);
		System.out.println("Number of annotation methods:" + (passCount + failCount));
	}

	public static int printPassedDetails(Method method, Foo foo) throws Exception {

		if ((method.isAnnotationPresent(ProTestCase.class) == true) && ((boolean) method.invoke(foo, null) == true)) {
			System.out.println("Test Passed");
			System.out.println(method.getName());
			return 1;

		}
		return 0;
	}

	public static int printFailedDetails(Method method, Foo foo) throws Exception {

		if ((method.isAnnotationPresent(ProTestCase.class) == true) && ((boolean) method.invoke(foo, null) == false)) {
			System.out.println("Test Failed");
			System.out.println(method.getName());
			return 1;
		}
		return 0;
	}
}
