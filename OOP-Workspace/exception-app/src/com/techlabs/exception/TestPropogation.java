package com.techlabs.exception;

public class TestPropogation {

	public static void main(String[] args){
		try {
		f1();
		}
		catch(Exception e) {
			System.out.println("Exception occurs");
			e.printStackTrace();
			//System.out.println(e.getStackTrace());
			//System.out.println(e.getMessage());
		}
		System.out.println("Inside main");
	}
	public static void f1()throws Exception {
		System.out.println("Inside f1 method ");
		f2();
	}
	public static void f2()throws Exception {
		System.out.println("Inside f2 method");
		f3();
	}
	public static void f3()throws Exception {
		System.out.println("Inside f3 method");
		throw new Exception("f3 Error");
	}

}
