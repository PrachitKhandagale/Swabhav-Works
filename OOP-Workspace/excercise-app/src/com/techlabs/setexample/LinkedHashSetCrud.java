package com.techlabs.setexample;

import java.util.LinkedHashSet;

public class LinkedHashSetCrud {

	LinkedHashSet<Integer> setLinkHash = new LinkedHashSet<Integer>();

	public static void main(String[] args) {
		LinkedHashSetCrud listcrud = new LinkedHashSetCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		setLinkHash.add(60); 
		setLinkHash.add(70);
		setLinkHash.add(80);
	}

	public void read() {
		System.out.println(setLinkHash);
	}

	public void update() {
		setLinkHash.add(90);
		setLinkHash.add(130);
		System.out.println(setLinkHash + "\nAfter Updating");
		System.out.println(setLinkHash);
	}

	public void delete() {
		setLinkHash.remove(70); 
		System.out.println("After deleting");
		System.out.println(setLinkHash);
	}

}
