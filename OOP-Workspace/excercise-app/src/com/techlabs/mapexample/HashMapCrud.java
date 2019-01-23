package com.techlabs.mapexample;

import java.util.HashMap;

import com.techlabs.setexample.TreeSetCrud;

public class HashMapCrud {
	HashMap<Integer,String> hashMapList = new HashMap<Integer,String>();

	public static void main(String[] args) {
		HashMapCrud listcrud = new HashMapCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		hashMapList.put(1,"Prachit");
		hashMapList.put(2,"Vinod");
		hashMapList.put(3,"Ajay");
	}

	public void read() {
		System.out.println(hashMapList);
	}

	public void update() {
		hashMapList.put(2,"Kuntan");
		hashMapList.replace(3, "Vinod");
		System.out.println(hashMapList + "\nAfter Updating");
		System.out.println(hashMapList);
	}

	public void delete() {
		hashMapList.remove(2);
		System.out.println("After deleting");
		System.out.println(hashMapList);
	}

}
