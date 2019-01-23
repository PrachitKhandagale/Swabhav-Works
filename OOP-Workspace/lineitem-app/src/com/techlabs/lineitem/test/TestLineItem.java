package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestLineItem {

	public static void main(String[] args) {
		double totalCost=0;
		ArrayList cart=new ArrayList();
		cart.add(new LineItem(1, "Pen", 10, 20));
		cart.add(new LineItem(2, "Pencil", 5, 10));
		cart.add(new LineItem(3, "Rubber", 3, 10));
		//cart.add("Swabhav");
		//cart.add(100);
		for(Object obj:cart) {
			LineItem lineitem=(LineItem) obj;
			lineitem.calculateTotal();
			totalCost=totalCost+lineitem.calculateTotal();
			System.out.println(" "+lineitem.getQuantity()+" "+lineitem.getName()+" "+
			lineitem.calculateTotal());
		}
	}
}
