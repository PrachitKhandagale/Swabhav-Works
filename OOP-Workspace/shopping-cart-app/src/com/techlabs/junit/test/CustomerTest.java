package com.techlabs.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.repository.Customer;
import com.techlabs.repository.Order;

class CustomerTest {

	@Test
	public void testForgetId() {
		Customer customer=new Customer("Prachit", "Mulund");
		assertEquals("Prachit", customer.getName());
	}

	@Test
	public void testForGetLocation() {
		Customer customer=new Customer("Prachit", "Mulund");
		assertEquals("Mulund", customer.getLocation());
	}
	

}
