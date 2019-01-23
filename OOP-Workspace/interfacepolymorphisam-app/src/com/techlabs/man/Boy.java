package com.techlabs.man;

public class Boy implements IMannerable,IEmotionable{

	@Override
	public void cry() {
		System.out.println("Boy crying");
		
	}

	@Override
	public void laugh() {
		System.out.println("Boy laugh");
	}

	@Override
	public void wish() {
		System.out.println("Boy say hello");
	}

	@Override
	public void depart() {
		System.out.println("Boy say bye");
	}

}
