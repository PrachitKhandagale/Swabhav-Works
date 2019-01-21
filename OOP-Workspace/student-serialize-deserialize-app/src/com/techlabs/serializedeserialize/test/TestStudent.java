package com.techlabs.serializedeserialize.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.serializedeserialize.Student;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		Student student = new Student("Prachit", 24, 8.06f);
		File file = new File("StudentData.txt");
		serializeObject(file, student);
		printDetails(student);
		Student student1 = deserializeObject(file, student);
		printDetails(student1);
	}

	private static void printDetails(Student student) {
		System.out.println(
				" Name : " + student.getName() + "\t Age : " + student.getAge() + "\tCGPA:" + student.getCgpa());
	}

	private static void serializeObject(File file, Student student) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(student);
			out.close();
			fos.close();
			System.out.println("Object has been serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Student deserializeObject(File file, Student student) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			student = (Student) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Object has been Deserialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}
