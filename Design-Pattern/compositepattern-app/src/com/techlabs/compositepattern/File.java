package com.techlabs.compositepattern;

import com.techlabs.compositepattern.test.TestDiskItems;

public class File implements IDiskItem {
	private String name;
	private String extension;
	private int size;

	public File(String name, String extension, int size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
	}

	@Override
	public void display() {
		//System.out.println(TestDiskItems.compositeBuilder + "File: " + this.getName() + " Extension: "
			//	+ this.getExtension() + " Size: " + this.getSize());
		 System.out.println(TestDiskItems.compositeBuilder+this.name+""+this.extension+" " +this.size+"KB");
	}

	public String getName() {
		return name;
	}

	public String getExtension() {
		return extension;
	}

	public int getSize() {
		return size;
	}

}
