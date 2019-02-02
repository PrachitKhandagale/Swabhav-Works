package com.techlabs.singleton;

public class DataService {
	private static DataService dataService;

	private DataService() {
		System.out.println("Data Service created");
	}

	public void doSomething() {
		System.out.println("Doing something by" + this.hashCode());
	}

	public static DataService getInstace() {
		if (dataService == null) {
			dataService = new DataService();
		}
		return dataService;
	}
}
