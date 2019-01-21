package com.techlabs.objectcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDeserializationTest {

	public static void main(String[] args) {
		ObjectDeserialization od=new ObjectDeserialization("Hello World");
		writeObject(od);
		readObject(od);
	}

	public static void writeObject(ObjectDeserialization od) {
		try {
			od = new ObjectDeserialization(od.getName());
			FileOutputStream f = new FileOutputStream("Hello.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(od);
			oos.close();
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readObject(ObjectDeserialization od) {
		try {
			FileInputStream f = new FileInputStream("Hello.txt");
			ObjectInputStream oos = new ObjectInputStream(f);
			od = (ObjectDeserialization) oos.readObject();
			oos.close();
			System.out.println(od.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
