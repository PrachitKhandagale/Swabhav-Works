package srp.violation.test;

import srp.violation.Invoice;

public class TestViolation {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(1, "Prachit", 200, 10f, 0.12f);
		//invoice.totalPrice();
		invoice.printInvoice();
	}
}
