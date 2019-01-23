package com.techlabs.listexample;

import java.util.ArrayList;

public class ArraylistCrud {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();

	public static void main(String[] args) {
		ArraylistCrud listcrud = new ArraylistCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		arraylist.add(10); 
		arraylist.add(20);
		arraylist.add(30);
	}

	public void read() {
		System.out.println(arraylist);
	}

	public void update() {
		arraylist.set(1, 30); 
		System.out.println(arraylist + "\nAfter Updating");
		System.out.println(arraylist);
	}

	public void delete() {
		arraylist.remove(1); 
		System.out.println("After deleting");
		System.out.println(arraylist);
	}
}
