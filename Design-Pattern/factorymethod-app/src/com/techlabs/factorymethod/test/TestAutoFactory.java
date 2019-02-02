package com.techlabs.factorymethod.test;

import com.techlabs.factorymethod.BMWFactory;
import com.techlabs.factorymethod.IAuto;
import com.techlabs.factorymethod.IAutoFactory;

public class TestAutoFactory {

	public static void main(String[] args) {
		IAutoFactory factory=BMWFactory.getInstance();
		IAuto bmw=factory.make();
		bmw.start();
		bmw.stop();
	}
}
