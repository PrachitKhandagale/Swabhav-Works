package com.techlabs.man.test;

import com.techlabs.constructor.Child;

public class TestParent {

	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.getFoo());
		Child child1=new Child(100);
		System.out.println(child1.getFoo());
	}

}
