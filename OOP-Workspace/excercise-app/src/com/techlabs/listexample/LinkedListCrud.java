package com.techlabs.listexample;

import java.util.LinkedList;

public class LinkedListCrud {
	LinkedList<Integer> linkedlist = new LinkedList<Integer>();

	public static void main(String[] args) {
		LinkedListCrud listcrud = new LinkedListCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
		listcrud.linkedListMethods();
	}

	public void create() {
		linkedlist.add(30); 
		linkedlist.add(40);
		linkedlist.add(50);
	}

	public void read() {
		System.out.println(linkedlist);
	}

	public void update() {
		linkedlist.set(1, 100); 
		System.out.println(linkedlist + "\nAfter Updating");
		System.out.println(linkedlist);
	}

	public void delete() {
		linkedlist.remove(1); 
		System.out.println("After deleting");
		System.out.println(linkedlist);
	}
	
	public void linkedListMethods() {
		System.out.println("LinkedList has Methods which are not in ArrayList.");
		linkedlist.addFirst(20); 
		linkedlist.offer(90); 
		System.out.println(linkedlist);
	}

}
