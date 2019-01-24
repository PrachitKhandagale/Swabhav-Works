package com.techlabs.map;

import java.util.Map;
import java.util.TreeMap;

import com.techlabs.employee.Employee;

public class TestTreeMap {

	public static void main(String[] args) {
		Employee employee = new Employee(101, 10, "Ajay", "Pandey", 2000);
		Employee employee1 = new Employee(101, 10, "PSK", "Patil", 3000);
		Employee employee2 = new Employee(101, 20, "Dheeraj", "Salvi", 5000);
		Employee employee3 = new Employee(102, 10, "Prachit", "Khandagale", 6600);

		Map<Employee, Employee> treeMap = new TreeMap<Employee, Employee>();

		treeMap.put(employee, employee);
		treeMap.put(employee1, employee1);
		treeMap.put(employee2, employee2);
		treeMap.put(employee3, employee3);

		System.out.println(treeMap.size());
		for (Map.Entry<Employee, Employee> entry : treeMap.entrySet()) {
			System.out.println("Key = " + entry.getKey().getDeptNumber() + ", Value = " + 
					entry.getValue().getEmpNumber());
		}
	}
}
