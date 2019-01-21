package com.techlabs.objectcreation;

public class ObjectCloning implements Cloneable {
	String name = "Hello World";
	public static void main(String[] args) throws Exception {
		ObjectCloning oc = new ObjectCloning();
		try {
			ObjectCloning oc2 = (ObjectCloning) oc.clone();
			System.out.println(oc2.name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
