package com.techlabs.basic;

import java.net.URI;

public class StringSliceDemo {

	public static void main(String[] args) throws Exception {
		String url = "http://www.swabhavtechlabs.com?developer=prachit&client=TCS";
		URI uri = new URI(url);
		 System.out.println("domain="+uri.getHost().split("\\.")[1]);
		String[] array = uri.getQuery().split("&");

		for (String name : array) {
			 System.out.println(name);
			// System.out.println(i.split("=")[1]);
		}

	}

}
