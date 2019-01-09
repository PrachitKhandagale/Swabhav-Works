package com.techlabs.basic;

public class SubStringDemo {

	public static void main(String[] url) {
		// String url = "http://www.swabhavtechlabs.com?developer=prachit&client=TCS";
		// System.out.println("domain="+url.substring(11,26));
		// System.out.println(url.substring(31,48));
		// System.out.println(url.substring(49));
		if (url.length != 0) {
			for(String name:url) {
			System.out.println("domain="+name.substring(11, 26));
			System.out.println(name.substring(31, 48));
			System.out.println(name.substring(49));
			}
		}
		else {
			System.out.println("Please enter url as argument.");
		}
	}
}
