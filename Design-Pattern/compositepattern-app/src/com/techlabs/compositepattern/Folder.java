package com.techlabs.compositepattern;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.compositepattern.test.TestDiskItems;

public class Folder implements IDiskItem {
	private String name;
	private List<IDiskItem> items;

	public Folder(String name) {
		this.name = name;
		items = new ArrayList<IDiskItem>();
	}

	public void addItem(IDiskItem diskitem) {
		items.add(diskitem);
	}

	public String getName() {
		return name;
	}

	public List<IDiskItem> getItems() {
		return items;
	}

	@Override
	public void display() {
		System.out.println(TestDiskItems.compositeBuilder+ getName());
		TestDiskItems.compositeBuilder.append("      ");
		for (IDiskItem e : items) {
			String name = e.getClass().getSimpleName();
			if (name.equals("Folder")) {

				((Folder) e).display();
			} else {
				((File) e).display();
			}
			TestDiskItems.compositeBuilder.setLength(TestDiskItems.compositeBuilder.length() - 3);
		}
	}

}
