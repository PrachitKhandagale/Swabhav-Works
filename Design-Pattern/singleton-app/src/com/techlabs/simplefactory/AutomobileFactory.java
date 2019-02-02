package com.techlabs.simplefactory;

public class AutomobileFactory {
	private static AutomobileFactory automobileFactory;

	private AutomobileFactory() {
		
	}
	
	public static AutomobileFactory getInstance() {
		if(automobileFactory==null) {
			return new AutomobileFactory();
		}
		return automobileFactory;
		
	}

	public IAutomobile make(AutoCarType type) {
		if (type == AutoCarType.BMW) {
			return new BMW();
		}
		if (type == AutoCarType.AUDI) {
			return new Audi();
		}
		if (type == AutoCarType.MINICOOPER) {
			return new MiniCooper();
		}
		return null;
	}

}
