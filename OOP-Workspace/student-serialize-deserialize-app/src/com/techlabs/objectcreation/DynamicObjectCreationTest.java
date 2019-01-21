package com.techlabs.objectcreation;

public class DynamicObjectCreationTest {
	String name = "Hello World";

	public static void main(String args[]) throws Exception {
		try {
			// Class cls=Class.forName("com.techlabs.objectwithoutnew.DynamicObjectCreationTest");
			// DynamicObjectCreationTest cwn=(DynamicObjectCreationTest) cls.newInstance();
			Class<DynamicObjectCreationTest> cls = DynamicObjectCreationTest.class;
			DynamicObjectCreationTest cwn = cls.newInstance();
			System.out.println(cwn.name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
