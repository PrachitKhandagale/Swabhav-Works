package com.techlabs.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.repository.Product;

class ProductTest {

	@Test
	public void testForCostAfterDiscount() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(90, product.costAfterDiscount());
	}

	@Test
	public void testForgetId() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(1, product.getId());
	}

	@Test
	public void testForgetName() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals("Deo", product.getName());
	}

	@Test
	public void testForgetCost() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(100, product.getCost());
	}

	@Test
	public void testForgetDiscount() {
		Product product = new Product(1, "Deo", 100, 10);
		assertEquals(10, product.getDiscount());
	}

}
