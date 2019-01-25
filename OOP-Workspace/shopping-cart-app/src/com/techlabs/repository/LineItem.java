package com.techlabs.repository;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;
	private double lineItemCost;

	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double getLineItemCost() {
		return lineItemCost;
	}

	public double calculateLineItemCost() {

		return lineItemCost = (quantity * product.costAfterDiscount());
	}

}
