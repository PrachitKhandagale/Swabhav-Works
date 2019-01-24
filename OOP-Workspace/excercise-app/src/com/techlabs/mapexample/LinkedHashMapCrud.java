package com.techlabs.mapexample;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapCrud {
	LinkedHashMap<Integer, String> linkedHashMapList = new LinkedHashMap<Integer, String>();

	public static void main(String[] args) {
		LinkedHashMapCrud listcrud = new LinkedHashMapCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		linkedHashMapList.put(1, "Prachit");
		linkedHashMapList.put(2, "Vinod");
		linkedHashMapList.put(3, "Ajay");
	}

	public void read() {
		//System.out.println(linkedHashMapList);
		Set<Integer> set = linkedHashMapList.keySet();
		for (Integer integer : set) {
			System.out.println(integer + " " + linkedHashMapList.get(integer));
		}
	}

	public void update() {
		linkedHashMapList.put(2, "Suchit");
		linkedHashMapList.replace(3, "James");
		System.out.println(linkedHashMapList + "\nAfter Updating");
		System.out.println(linkedHashMapList);
	}

	public void delete() {
		linkedHashMapList.remove(3);
		System.out.println("After deleting");
		System.out.println(linkedHashMapList);
	}

}
