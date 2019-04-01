package com.techlabs.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeHeirarchyBuild {

	private Employee rootEmployee = null;
	private Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public EmployeeHeirarchyBuild(Set<Employee> empSet) {
		for (Employee employee : empSet) {
			empMap.put(employee.getEmpId(), employee);
		}
		getEmployeeHeirachy();
	}

	public Employee getRoot() {
		for (Employee employee : empMap.values()) {
			if (employee.getManagerId() == null) {
				return rootEmployee = employee;
			}
		}
		return rootEmployee;
	}

	public Employee getRootEmployee() {
		return rootEmployee;
	}

	public void setRootEmployee(Employee rootEmployee) {
		this.rootEmployee = rootEmployee;
	}

	public Map<Integer, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, Employee> empMap) {
		this.empMap = empMap;
	}

	public void getEmployeeHeirachy() {
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (empMap.containsKey(entry.getValue().getManagerId())) {
				Employee employee = empMap.get(entry.getValue().getManagerId());
				employee.addReportee(entry.getValue());
			}
		}
	}

}