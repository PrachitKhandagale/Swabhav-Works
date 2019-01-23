package com.techlabs.crud;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Customer DB created");
	}

	@Override
	public void read() {
		System.out.println("Reading from Customer DB");
	}

	@Override
	public void update() {
		System.out.println("Customer DB updated");
	}

	@Override
	public void delete() {
		System.out.println("Deleting from Customer DB");
	}
	

}
