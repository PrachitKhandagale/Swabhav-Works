package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoCarType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;

public class TestAutomobile {

	public static void main(String[] args) {
		AutomobileFactory automobileFactory = AutomobileFactory.getInstance();
		IAutomobile bmw = automobileFactory.make(AutoCarType.BMW);
		bmw.start();
		bmw.stop();
		System.out.println(bmw.getClass());
	}

}
