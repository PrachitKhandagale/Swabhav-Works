package com.techlabs.employee;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeHeirarchy {
	private Employee rootEmployee;
	private List<Employee> managerList;
	private Set<Employee> empSet = new TreeSet<Employee>();

	public EmployeeHeirarchy(Set<Employee> empSet) {
		this.empSet = empSet;
	}

	public Employee getCEO() {
		rootEmployee = null;
		for (Employee emp : empSet) {
			if (emp.getManagerId() == null) {
				rootEmployee = emp;
			}
//			} else {
//				Employee mgr = getManager(emp,empSet);
//				mgr.getEmpList().add(emp);
//			}
		}
		return rootEmployee;
	}
	
	public void getManager() {
		for(Employee emp:empSet) {
			if(rootEmployee.getEmpId()==emp.getManagerId()) {
				rootEmployee.addReportee(emp);
				managerList.add(emp);
			}
		}
			
	}

	public List<Employee> getManagerList() {
		return managerList;
	}

	
	
	
	
	
	
	
	
	
	
	
//	public Employee getManager(Employee emp,Set<Employee> empList) {
//		for(Employee e:empList)
//			if(emp.getManagerId().equals(e.getEmpId()))
//				return e;
//		return null;
//	}
}
