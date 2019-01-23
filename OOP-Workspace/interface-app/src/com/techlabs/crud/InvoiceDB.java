package com.techlabs.crud;

public class InvoiceDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("Invoice DB Created");
		
	}

	@Override
	public void read() {
		System.out.println("Reading from Invoice DB");
		
	}

	@Override
	public void update() {
		System.out.println("invoice DB updated");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting from Invoice DB");
		
	}

}
