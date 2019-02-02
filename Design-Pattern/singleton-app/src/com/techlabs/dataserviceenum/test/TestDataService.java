package com.techlabs.dataserviceenum.test;

import com.techlabs.dataserviceenum.DataService;
import com.techlabs.dataserviceenum.DataServiceEnum;

public class TestDataService {

	public static void main(String[] args) {
		DataService service1 = DataService.getInstance();
		service1.doSomething();
		DataService service2 = DataService.getInstance();
		service2.doSomething();
		DataServiceEnum dataServiceEnum1 = DataServiceEnum.DATASERVICEENUM;//singleton
		DataServiceEnum dataServiceEnum2 = DataServiceEnum.DATASERVICEENUM;
		System.out.println(dataServiceEnum1.hashCode());
		System.out.println(dataServiceEnum2.hashCode());

	}

}
