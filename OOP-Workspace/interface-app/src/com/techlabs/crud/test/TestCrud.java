package com.techlabs.crud.test;

import com.techlabs.crud.CustomerDB;
import com.techlabs.crud.ICrudable;
import com.techlabs.crud.InvoiceDB;
import com.techlabs.crud.OrderDB;

public class TestCrud {

	public static void main(String[] args) {
		doDBOperations(new CustomerDB());
		doDBOperations(new InvoiceDB());
		doDBOperations(new OrderDB());
		
	}
	
	public static void doDBOperations(ICrudable icrudable) {
		icrudable.create();
		icrudable.read();
		icrudable.update();
		icrudable.delete();
	}

}
