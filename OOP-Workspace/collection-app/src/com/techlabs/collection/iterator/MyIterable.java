package com.techlabs.collection.iterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyIterable<T> implements Iterable<T>{
	private List list;
	public MyIterable(T[] t) {
		list = Arrays.asList(t);
	}
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
	public static void main(String [] args) {
		Integer [] intArray = {1, 2, 3};
		MyIterable<Integer> myList = new MyIterable<Integer>(intArray);
		for (Integer i : myList) {
			System.out.println(i);
		}

	}

}
