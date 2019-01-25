package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit=new FixedDeposit(1, "Prachit", 10000, FestivalType.NEWYEAR, 10);
		System.out.println(fixedDeposit.calculateSimpleInterest());
	}

}
