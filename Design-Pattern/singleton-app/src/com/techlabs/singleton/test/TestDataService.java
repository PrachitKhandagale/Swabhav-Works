package com.techlabs.singleton.test;

import com.techlabs.singleton.DataService;

public class TestDataService {

	public static void main(String[] args) {
		DataService ds1=DataService.getInstace();
		ds1.doSomething();
		DataService ds2=DataService.getInstace();
		ds2.doSomething();
		System.out.println(ds1.hashCode());
		System.out.println(ds2.hashCode());
	}

}
