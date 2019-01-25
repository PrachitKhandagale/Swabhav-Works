package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.HoliFestival;
import ocp.solution.NewYearFestival;
import ocp.solution.NormalFestival;

public class TestFixedDeposit {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit=new FixedDeposit(1, "Prachit", 10000, 10,new NormalFestival());
		System.out.println(fixedDeposit.calculateSimpleInterest());
		
		FixedDeposit fixedDeposit1=new FixedDeposit(2, "Vinod", 10000, 10,new NewYearFestival());
		System.out.println(fixedDeposit1.calculateSimpleInterest());
		
		FixedDeposit fixedDeposit2=new FixedDeposit(3, "Ajay", 10000, 10,new HoliFestival());
		System.out.println(fixedDeposit2.calculateSimpleInterest());
	}
}
