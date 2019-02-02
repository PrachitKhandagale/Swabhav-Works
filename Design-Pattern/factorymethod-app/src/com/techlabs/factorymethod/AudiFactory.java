package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory audiFactory;
	
	private  AudiFactory() {
	}
	
	public static AudiFactory getInstance() {
		if(audiFactory==null) {
			return new AudiFactory();
		}
		return audiFactory;
	}

	@Override
	public IAuto make() {
		return new Audi();
	}
}
