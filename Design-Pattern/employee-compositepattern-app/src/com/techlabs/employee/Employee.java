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
	public void display() {
		System.out.println(compositeBuilder + empName+"-"+designation);
		String len = compositeBuilder;
		compositeBuilder=compositeBuilder +"   ";
		for (Employee e : empList) {
			e.display();
		}
		compositeBuilder = len;
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
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empList == null) ? 0 : empList.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((managerId == null) ? 0 : managerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empList == null) {
			if (other.empList != null)
				return false;
		} else if (!empList.equals(other.empList))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (managerId == null) {
			if (other.managerId != null)
				return false;
		} else if (!managerId.equals(other.managerId))
			return false;
		return true;
	}
	

}
