package com.techlabs.dataserviceenum;

public class DataService {
	private static final DataService DATASERVICEENUM = new DataService();

	private DataService() {
		System.out.println("Service Created");
	}

	public void doSomething() {
		System.out.println("Doing something by" + hashCode());
	}

	public static DataService getInstance() {
		return DATASERVICEENUM;
	}

}
