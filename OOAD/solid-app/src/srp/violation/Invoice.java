package srp.violation;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private float discount;
	private float gst;

	public Invoice(int id, String name, double cost, float discount, float gst) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}

	public double calculateTax() {
		return (cost * 0.12);
	}

	public double calculateDiscount() {
		return (discount * cost) / 100;
	}

	public double totalPrice() {
		return this.cost - this.calculateDiscount() + this.calculateTax();
	}

	public void printInvoice() {
		System.out.println("ID:" + this.getId() + "\nName:" + this.getName() + "\nCost:" + this.getCost()
				+ "\nTotal Discount:" + this.calculateDiscount() + "\nTotal Tax:" + this.calculateTax()
				+ "\nTotal Price:" + this.totalPrice());
	}
}
