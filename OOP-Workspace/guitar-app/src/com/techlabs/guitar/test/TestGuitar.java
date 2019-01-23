package com.techlabs.guitar.test;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;
import com.techlabs.service.Inventory;

public class TestGuitar {

	public static void main(String[] args) {
		Inventory inventory=new Inventory();
		inventory.addGuitar("A1", 12000, "Expensive", Builder.FENDER, Type.ACOUSTIC, 
				Wood.ALDER, Wood.BASSWOOD, 10);
		inventory.addGuitar("A2", 10000, "Arman", Builder.GIBSON, Type.ELECTRIC, 
				Wood.BASSWOOD, Wood.ALDER, 11);
		inventory.addGuitar("A3", 12500, "ABC", Builder.MARTIN, Type.ACOUSTIC, 
				Wood.ALDER, Wood.MAPLE, 12);
		inventory.addGuitar("A4", 20000, "XYZ", Builder.FENDER, Type.ELECTRIC, 
				Wood.MAPLE, Wood.BASSWOOD, 13);
		System.out.println(inventory.getGuitars());

	}

}
