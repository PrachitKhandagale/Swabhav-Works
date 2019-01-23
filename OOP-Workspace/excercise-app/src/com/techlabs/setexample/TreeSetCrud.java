package com.techlabs.setexample;

import java.util.LinkedHashSet;

public class TreeSetCrud {

	LinkedHashSet<Integer> setTree = new LinkedHashSet<Integer>();

	public static void main(String[] args) {
		TreeSetCrud listcrud = new TreeSetCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		setTree.add(160);
		setTree.add(170);
		setTree.add(180);
	}

	public void read() {
		System.out.println(setTree);
	}

	public void update() {
		setTree.add(190);
		setTree.add(210);
		System.out.println(setTree + "\nAfter Updating");
		System.out.println(setTree);
	}

	public void delete() {
		setTree.remove(190);
		System.out.println("After deleting");
		System.out.println(setTree);
	}
}
