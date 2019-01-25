package com.techlabs.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;;

public class Order {
	private Date date;
	private List<LineItem> items = new ArrayList<LineItem>();
	private double totalPrice;

	public Order(Date date) {
		this.date = date;
		//this.items = items;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}
	
	public void addItem(LineItem lineitem) {
		items.add(lineitem);
	}
	
	public double checkOutPrice() {
		for(LineItem lineitem:items) {
			totalPrice=totalPrice+lineitem.calculateLineItemCost();
		}
		return totalPrice;
	}

}
