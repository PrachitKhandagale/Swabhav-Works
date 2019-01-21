package com.techlabs.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {

	    List<String> list = new ArrayList<>();
	    list.add("prachit");
	    list.add("bhavesh");
	    list.add("ajay");
	    list.add("demo");
	    list.add("vinod");
	    list.add("gaurav");

	    Iterator<String> iterato = list.iterator();
	    while (iterato.hasNext()) {
	        String string = iterato.next();
	        System.out.println(string);
	    }
	}
}
