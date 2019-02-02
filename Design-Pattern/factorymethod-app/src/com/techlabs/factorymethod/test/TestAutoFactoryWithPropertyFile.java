package com.techlabs.factorymethod.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factorymethod.IAuto;
import com.techlabs.factorymethod.IAutoFactory;

public class TestAutoFactoryWithPropertyFile {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		InputStream input = null;
		try {

			input = new FileInputStream("PropertyFile/config.properties");
			prop.load(input);
			String factory = prop.getProperty("currentfactory");
			Class cls = Class.forName(factory);
			Method method = cls.getDeclaredMethod("getInstance");
			IAutoFactory factory2 = (IAutoFactory) method.invoke(null, null);
			IAuto car = factory2.make();
			car.start();
			car.stop();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
