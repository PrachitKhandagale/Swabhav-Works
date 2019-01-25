package srp.solution.test;
import srp.solution.Invoice;
import srp.solution.InvoicePrinter;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(1, "Vinod", 2000, 15f, 0.12f);
		InvoicePrinter invoiceprint=new InvoicePrinter();
		invoiceprint.printInvoice(invoice);
	}

}
