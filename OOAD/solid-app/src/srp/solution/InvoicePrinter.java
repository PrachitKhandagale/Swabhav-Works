package srp.solution;

public class InvoicePrinter {
	public void printInvoice(Invoice invoice) {
		System.out.println("ID:" + invoice.getId() + "\nName:" + invoice.getName() + "\nCost:" + invoice.getCost()
				+ "\nTotal Discount:" + invoice.calculateDiscount() + "\nTotal Tax:" + invoice.calculateTax()
				+ "\nTotal Price:" + invoice.totalPrice());
	}

}
