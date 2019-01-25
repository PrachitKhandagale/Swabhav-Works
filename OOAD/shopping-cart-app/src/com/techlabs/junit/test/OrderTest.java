package com.techlabs.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.repository.LineItem;
import com.techlabs.repository.Order;
import com.techlabs.repository.Product;

class OrderTest {

	@Test
	public void testForCheckOutPrice() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineItem = new LineItem(1, 2, product);
		Product product1 = new Product(2, "Shirt", 200, 50);
		LineItem lineItem1 = new LineItem(2, 1, product1);
		double exp=280.0;
		Order order = new Order(new java.util.Date(System.currentTimeMillis()));
		order.addItem(lineItem);
		order.addItem(lineItem1);
		double actual=order.checkOutPrice();
		assertEquals(exp,actual);
	}
	@Test
	public void testForDate() throws Exception {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("2018-09-09");
		Order order=new Order(date);
		assertEquals(date, order.getDate());
	}

}
