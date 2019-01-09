package com.techlabs.basic;

public class StringSplitEasy {

	public static void main(String[] args) {
		String url = "http://www.swabhavtechlabs.com?developer=prachit&client=TCS";
		String[] domain = url.split("\\.");
		System.out.println("domain="+domain[1]);
		String arrayString=domain[2];
		String[] arrayString1=arrayString.split("\\?");
		String arrayString2=arrayString1[1];
		String[] arrayString3=arrayString2.split("&");
		System.out.println(arrayString3[0]);
		System.out.println(arrayString3[1]);
	}

}
