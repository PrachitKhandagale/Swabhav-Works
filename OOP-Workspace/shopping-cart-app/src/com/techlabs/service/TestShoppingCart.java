package com.techlabs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techlabs.repository.Customer;
import com.techlabs.repository.LineItem;
import com.techlabs.repository.Order;
import com.techlabs.repository.Product;

public class TestShoppingCart {
	public static void main(String[] args) throws Exception {
//		String pattern = "yyyy-MM-dd";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		Date date = simpleDateFormat.parse("2019-01-29");
		
		
		Customer customer=new Customer("Prachit","Mulund");
		Product product=new Product(1, "Deo", 100, 10f);
		LineItem lineitem=new LineItem(1, 2, product);
		Product product1=new Product(2, "Pant", 200, 50f);
		LineItem lineitem1=new LineItem(2, 2, product1);
		
		
//		order.addItem(lineitem);
//		order.addItem(lineitem1);
//		customer.addOrder(order);
		printDetails(customer);
	}
	
	public static void displayLineItemPrices(LineItem lineitem) {
		System.out.println("Product id:"+lineitem.getId());
		System.out.println("Product name:"+lineitem.getProduct());
		System.out.println("Product quantity:"+lineitem.getQuantity());
		System.out.println("Product price:"+lineitem.calculateLineItemCost());
	}
	
	public static void printDetails(Customer customer) {
		Date date1=new Date();
		Order order=new Order(date1);
		
		List<Order> orders1=new ArrayList<Order>();
		List<LineItem> lineitem2=new ArrayList<LineItem>();
		for(Order order3:orders1){
			lineitem2=order.getItems();
			order=order3;
		}
		System.out.println("Customer Name:"+customer.getName()+" Location:"+customer.getLocation());
		System.out.println("Order details:");
		for(LineItem item:lineitem2) {
			displayLineItemPrices(item);
		}
		System.out.println("Total checkout Price:"+orders1);
		
	}
}
