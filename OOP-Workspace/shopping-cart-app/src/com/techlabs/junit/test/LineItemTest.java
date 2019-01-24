package com.techlabs.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.repository.LineItem;
import com.techlabs.repository.Product;

class LineItemTest {
	@Test
	public void testForCalculateLineItemCost() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineitem = new LineItem(1, 3, product);
		assertEquals(270, lineitem.calculateLineItemCost());
	}

	@Test
	public void testForgetId() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineitem = new LineItem(1, 3, product);
		assertEquals(1, lineitem.getId());
	}

	@Test
	public void testForGetQuantity() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineitem = new LineItem(1, 3, product);
		assertEquals(3, lineitem.getQuantity());
	}

	@Test
	public void testForGetProduct() {
		Product product = new Product(1, "Deo", 100, 10);
		LineItem lineitem = new LineItem(1, 3, product);
		assertEquals(product, lineitem.getProduct());
	}

}
