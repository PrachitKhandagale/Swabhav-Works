package com.techlabs.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Pen");
		list.add("Nagpur");
		list.add("Satara");
		System.out.println(list.indexOf("Pen"));
	}

}
