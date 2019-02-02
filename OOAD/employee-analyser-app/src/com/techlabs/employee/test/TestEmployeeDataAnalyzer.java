package com.techlabs.employee.test;

import java.net.URL;

import com.techlabs.employee.DiskLoader;
import com.techlabs.employee.EmployeeDataAnalyzer;
import com.techlabs.employee.EmployeeDetails;
import com.techlabs.employee.Parser;
import com.techlabs.employee.UrlLoader;

public class TestEmployeeDataAnalyzer {

	public static void main(String[] args) throws Exception {
		String path = "https://swabhav-tech.firebaseapp.com/emp.txt ";
		URL url = new URL(path);
		UrlLoader urlLoader = new UrlLoader(url);
		//Parser dataParser = new Parser(urlLoader);
		String path1="Data/dataFile.txt";
		DiskLoader diskLoader=new DiskLoader(path1);
		Parser dataParser = new Parser(diskLoader);
		dataParser.parse();
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(dataParser);
		EmployeeDetails employee = analyzer.maximunSalary();
		System.out.println("Maximum salaried Employee:"+employee);
		System.out.println("Total Employee:"+analyzer.totalEmployee());
		System.out.println("Based on Department Id Numebr of Employees:"+
		analyzer.numberOfEmployeeByDepartmentNumber());
		System.out.println("Different Department Designations:\n"
				+analyzer.numberOfEmployeeByDepartment());
	}
}
