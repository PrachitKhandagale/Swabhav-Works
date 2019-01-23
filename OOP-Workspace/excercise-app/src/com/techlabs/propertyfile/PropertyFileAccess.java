package com.techlabs.propertyfile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileAccess {
	public static void main(String[] args) throws IOException {
		FileReader filereader=new FileReader("PropertyDetails.properties");  
	    Properties property=new Properties();  
	    property.load(filereader);  
	    System.out.println(property.getProperty("email"));  
	    System.out.println(property.getProperty("name"));  
	}

}
