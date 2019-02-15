package com.techlabs.employee.test;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Set;

import com.techlabs.employee.Employee;
import com.techlabs.employee.EmployeeHeirarchyBuild;
import com.techlabs.employee.EmployeeParser;
import com.techlabs.employee.FileLoader;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		FileLoader fileLoader=new FileLoader("dataFile.txt");
		ArrayList<String> list=fileLoader.loadFile();
		
		EmployeeParser employeeParser=new EmployeeParser();
		Set<Employee> empSet=employeeParser.parse(list);
		
		EmployeeHeirarchyBuild heirarchyBuilder=new EmployeeHeirarchyBuild(empSet);
		Employee root=heirarchyBuilder.getRoot();
		
		root.display();
		StringBuffer stringBuffer=root.displayDetails();
		String employee=stringBuffer.toString();
		createXmlFile(employee);
		
		System.out.println(root.displayDetails());
	}
	public static void createXmlFile(String xmlFile) throws Exception {
		FileWriter fileWriter =new FileWriter("CEODetails.xml");
		fileWriter.write(xmlFile);
		fileWriter.close();
	}

}
