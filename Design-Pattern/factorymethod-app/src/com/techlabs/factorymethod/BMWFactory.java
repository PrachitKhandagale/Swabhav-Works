package com.techlabs.factorymethod;

public class BMWFactory implements IAutoFactory {
	private static BMWFactory bmwFactory;

	private BMWFactory() {
	}

	public static BMWFactory getInstance() {
		if (bmwFactory == null) {
			return new BMWFactory();
		}
		return bmwFactory;
	}

	@Override
	public IAuto make() {
		return new BMW();
	}

}
