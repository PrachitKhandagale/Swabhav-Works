package com.techlabs.crud;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Order DB created");
	}

	@Override
	public void read() {
		System.out.println("Reading from Order DB");
	}

	@Override
	public void update() {
		System.out.println("Order DB updated");
	}

	@Override
	public void delete() {
		System.out.println("Deleting from Order DB");
	}
}
