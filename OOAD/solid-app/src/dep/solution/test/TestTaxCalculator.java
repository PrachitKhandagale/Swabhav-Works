package dep.solution.test;

import dep.solution.DbLogger;
import dep.solution.TaxCalculator;
import dep.solution.XMLogger;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator calculate=new TaxCalculator(new DbLogger());
		calculate.calculateTax(0, 0);
		
		TaxCalculator calculate1=new TaxCalculator(new XMLogger());
		System.out.println(calculate1.calculateTax(10, 10));
	}
}
