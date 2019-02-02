package dep.violation.test;

import dep.violation.LogType;
import dep.violation.TaxCalculator;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator calculate=new TaxCalculator(LogType.DB);
		calculate.calculateTax(0, 0);
	}
}
