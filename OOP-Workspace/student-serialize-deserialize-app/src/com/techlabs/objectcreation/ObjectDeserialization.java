package com.techlabs.objectcreation;

import java.io.Serializable;

public class ObjectDeserialization implements Serializable {
	 private String name; 
	 ObjectDeserialization(String name) 
	    { 
	        this.name = name; 
	    }
	public String getName() {
		return name;
	}
}
