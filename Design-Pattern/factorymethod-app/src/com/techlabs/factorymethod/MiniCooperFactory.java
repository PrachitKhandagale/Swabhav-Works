package com.techlabs.factorymethod;

public class MiniCooperFactory implements IAutoFactory {
	private static MiniCooperFactory miniCooperFactory;

	private MiniCooperFactory() {
	}

	public static MiniCooperFactory getInstance() {
		if (miniCooperFactory == null) {
			return new MiniCooperFactory();
		}
		return miniCooperFactory;
	}

	@Override
	public IAuto make() {
		return new MiniCooper();
	}
}
