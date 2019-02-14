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
		getEmpHeirarchy();
	}

	public Employee getRoot() {
		for (Employee employee : empMap.values()) {
			if (employee.getManagerId() == null) {
				return rootEmployee = employee;
			}
		}
		return rootEmployee;
	}
	
	public void getEmpHeirarchy() {
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			for(Map.Entry<Integer, Employee> repotee : empMap.entrySet()) {
				if(repotee.getValue().getManagerId()!=null) {
					if(entry.getKey().equals(repotee.getValue().getManagerId())) {
						entry.getValue().addReportee(repotee.getValue());
					}
				}else {
					rootEmployee=repotee.getValue();
				}
			}
		}
	}
}