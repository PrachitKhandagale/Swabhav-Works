package dep.solution;

public class TaxCalculator {
	private ILogger log;

	public TaxCalculator(ILogger log) {
		this.log = log;
	}

	public int calculateTax(int amount, int rate) {
		try {
			return rate = amount / rate;
			//System.out.println(rate);
		} catch (Exception e) {
			if (log instanceof DbLogger) {
				ILogger dbLog = new DbLogger();
				dbLog.log("Please login DB");

			} else {
				ILogger xmlLog = new XMLogger();
				xmlLog.log("Please log XML");
			}
		}
		return rate;
	}

}
