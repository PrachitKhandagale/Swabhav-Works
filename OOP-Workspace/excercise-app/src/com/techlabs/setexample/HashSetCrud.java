package com.techlabs.setexample;

import java.util.HashSet;

import com.techlabs.listexample.LinkedListCrud;

public class HashSetCrud {

	HashSet<Integer> setHash = new HashSet<Integer>();

	public static void main(String[] args) {
		HashSetCrud listcrud = new HashSetCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		setHash.add(30); 
		setHash.add(40);
		setHash.add(50);
	}

	public void read() {
		System.out.println(setHash);
	}

	public void update() {
		setHash.add(80);
		setHash.add(30);
		System.out.println(setHash + "\nAfter Updating");
		System.out.println(setHash);
	}

	public void delete() {
		setHash.remove(40); 
		System.out.println("After deleting");
		System.out.println(setHash);
	}
	
}
