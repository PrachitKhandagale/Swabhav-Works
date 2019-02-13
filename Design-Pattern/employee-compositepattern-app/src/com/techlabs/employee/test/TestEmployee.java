package com.techlabs.employee.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.techlabs.employee.Employee;
import com.techlabs.employee.EmployeeHeirarchy;
import com.techlabs.employee.EmployeeParser;
import com.techlabs.employee.FileLoader;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		FileLoader fileLoader=new FileLoader("dataFile.txt");
		ArrayList<String> list=fileLoader.loadFile();
		
		EmployeeParser employeeParser=new EmployeeParser();
		Set<Employee> empSet=employeeParser.parse(list);
		
		EmployeeHeirarchy employeeHirarchy=new EmployeeHeirarchy(empSet);
		Employee ceo=employeeHirarchy.getRootEmployee();
		ceo.display();
	}

}
