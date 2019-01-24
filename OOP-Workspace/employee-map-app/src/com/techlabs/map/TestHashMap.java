package com.techlabs.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.techlabs.employee.Employee;

public class TestHashMap {

	public static void main(String[] args) {
		Employee employee = new Employee(101, 10, "Ajay", "Pandey", 2000);
		Employee employee1 = new Employee(101, 10, "PSK", "Patil", 3000);
		Employee employee2 = new Employee(101, 20, "Dheeraj", "Salvi", 5000);
		Employee employee3 = new Employee(102, 10, "Prachit", "Khandagale", 6600);

		Map<Employee, Employee> hashMap = new HashMap<Employee, Employee>();

		hashMap.put(employee, employee);
		hashMap.put(employee1, employee1);
		hashMap.put(employee2, employee2);
		hashMap.put(employee3, employee3);

		System.out.println(hashMap.size());
		for (Employee emp : hashMap.keySet()) {
			System.out.println(emp.hashCode() + " " + emp.getFirstName());
		}
		for (Map.Entry<Employee, Employee> entry : hashMap.entrySet()) {
			System.out.println("Key = " + entry.getKey().getDeptNumber() + ", Value = " + 
					entry.getValue().getEmpNumber());
		}
	}

}
