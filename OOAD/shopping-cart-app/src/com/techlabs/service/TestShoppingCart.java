package com.techlabs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techlabs.repository.Customer;
import com.techlabs.repository.LineItem;
import com.techlabs.repository.Order;
import com.techlabs.repository.Product;

public class TestShoppingCart {
	public static void main(String[] args) {
		Customer customer = new Customer("Prachit", "Thane");
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		Product product1 = new Product(2, "Pant", 200, 50);
		LineItem lineItem1 = new LineItem(2, 1, product1);
		LineItem lineItem2 = new LineItem(2, 1, product1);
		
		Date date = new Date(2019, 01, 25);
		Order order = new Order(date);
		order.addItem(lineItem);
		order.addItem(lineItem1);
		order.addItem(lineItem2);
		customer.addOrder(order);
		order.checkOutPrice();
		printDetails(customer);
	}

	public static void printDetails(Customer customer) {
		List<Order> orders = new ArrayList<Order>();
		orders = customer.getOrders();

		java.util.Date date = null;
		Order orderObj = new Order(date);
		List<LineItem> item = new ArrayList<LineItem>();
		for (Order order : orders) {
			date = order.getDate();
			item = order.getItems();
			orderObj = order;
		}

		System.out.println(
				"Customer Name:" + customer.getName() + " Location:" + customer.getLocation() + " Date:" + date);
		System.out.println("Order Details");

		for (LineItem lineItem : item) {
			displayLineItemDetails(lineItem);
		}

		System.out.println("Total CheckOut Price :" + orderObj.getTotalPrice());
	}

	public static void displayLineItemDetails(LineItem lineItem) {
		System.out.println("Product Id:" + lineItem.getId() + " Product Name:" + lineItem.getProduct().getName()
				+ " Quantity: " + lineItem.getQuantity() + " TotalPrice:" + lineItem.getLineItemCost() + " Discount:"
				+ lineItem.getProduct().getDiscount() + "%");
	}
}
