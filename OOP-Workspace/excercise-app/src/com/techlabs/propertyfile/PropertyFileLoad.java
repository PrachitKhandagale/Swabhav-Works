package com.techlabs.propertyfile;

import java.io.FileWriter;
import java.util.Properties;

public class PropertyFileLoad {
	public static void main(String[] args) throws Exception {
		Properties property = new Properties();
		property.setProperty("name", "Prachit");
		property.setProperty("email", "prachit@yahoo.com");
		property.store(new FileWriter("PropertyDetails.properties"), "Property File Content Write");
	}
}
