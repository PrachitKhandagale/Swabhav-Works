package com.techlabs.lineitem.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.lineitem.LineItem;

public class LineItemGenerics {

	public static void main(String[] args) {
		double totalCost=0;
		ArrayList<LineItem> cart=new ArrayList<LineItem>();
		cart.add(new LineItem(1, "Pen", 10, 20));
		cart.add(new LineItem(2, "Pencil", 5, 10));
		cart.add(new LineItem(3, "Rubber", 3, 10));
		for(LineItem lineitem:cart) {
			lineitem.calculateTotal();
			totalCost=totalCost+lineitem.calculateTotal();
			System.out.println(" "+lineitem.getQuantity()+" "+lineitem.getName()+" "+
			lineitem.calculateTotal());
		}
		
	}

}
