package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{
	private Integer empId;
	private Integer managerId;
	private String empName;
	private String designation;
	private static String compositeBuilder = " ";
	private List<Employee> empList = new ArrayList<Employee>();

	public Employee(Integer empId, Integer managerId, String empName, String designation) {
		this.empId = empId;
		this.managerId = managerId;
		this.empName = empName;
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public Integer getEmpId() {
		return empId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public String getEmpName() {
		return empName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void addReportee(Employee employee) {
		empList.add(employee);
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.empId-o.empId;
	}
	public void display() {
		System.out.println(compositeBuilder + empName);
		String len = compositeBuilder;
		compositeBuilder=compositeBuilder +"   ";
		for (Employee e : empList) {
			e.display();
		}
		compositeBuilder = len;
	}

}
