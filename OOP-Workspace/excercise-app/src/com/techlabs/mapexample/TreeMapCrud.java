package com.techlabs.mapexample;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapCrud {
	TreeMap<Integer,String> treeMapList = new TreeMap<Integer,String>();

	public static void main(String[] args) {
		TreeMapCrud listcrud = new TreeMapCrud();
		listcrud.create();
		listcrud.read();
		listcrud.update();
		listcrud.delete();
	}

	public void create() {
		treeMapList.put(1,"Prachit");
		treeMapList.put(2,"Vinod");
		treeMapList.put(3,"Ajay");
	}

	public void read() {
		//System.out.println(treeMapList);
		Set<Integer> set = treeMapList.keySet();
		for (Integer integer : set) {
			System.out.println(integer + " " + treeMapList.get(integer));
		}
		
	}

	public void update() {
		treeMapList.put(2,"Abhijeet");
		treeMapList.replace(3, "Pratham");
		System.out.println(treeMapList + "\nAfter Updating");
		System.out.println(treeMapList);
	}

	public void delete() {
		treeMapList.remove(2);
		System.out.println("After deleting");
		System.out.println(treeMapList);
	}

}
