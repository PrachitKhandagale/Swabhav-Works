package com.techlabs.factorymethod;

class MiniCooper implements IAuto {

	@Override
	public void start() {
		System.out.println("MiniCooper start");
	}

	@Override
	public void stop() {
		System.out.println("MiniCooper stop");
	}

}
