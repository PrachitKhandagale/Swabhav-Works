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
		//System.out.println(list);
		
		EmployeeParser employeeParser=new EmployeeParser();
		Set<Employee> empSet=employeeParser.parse(list);
		//System.out.println(empSet);
		
		EmployeeHeirarchy empHeirarchy=new EmployeeHeirarchy(empSet);
		System.out.println(empHeirarchy.getCEO().getEmpName());
		
		empHeirarchy.getManager();
		List<Employee> managerList=empHeirarchy.getManagerList();
	}

}
