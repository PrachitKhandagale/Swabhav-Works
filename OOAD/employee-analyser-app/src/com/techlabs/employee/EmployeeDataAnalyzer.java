package com.techlabs.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeDataAnalyzer {
	private Parser dataParser;
	Map<Integer, Integer> departmentIdMap = new HashMap<>();
	Map<String, Integer> designationMap = new HashMap<>();

	public EmployeeDataAnalyzer(Parser dataParser) {
		this.dataParser = dataParser;
	}

	public EmployeeDetails maximunSalary() {
		Set<EmployeeDetails> setEmployee;
		setEmployee = dataParser.getEmpDataSet();
		List<EmployeeDetails> listEmployee = new ArrayList<EmployeeDetails>(setEmployee);
		Comparator<EmployeeDetails> salarySort = new Comparator<EmployeeDetails>() {

			@Override
			public int compare(EmployeeDetails o1, EmployeeDetails o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		};
		Collections.sort(listEmployee, salarySort);

		return listEmployee.get(listEmployee.size() - 1);
	}

	public int totalEmployee() {
		Set<EmployeeDetails> setEmployee;
		setEmployee = dataParser.getEmpDataSet();
		return setEmployee.size();

	}

	public Map<String, Integer> numberOfEmployeeByDepartment() {
		Set<EmployeeDetails> empDetailSet = dataParser.getEmpDataSet();
		// Map<String, Integer> designationMap = new HashMap<>();
		for (EmployeeDetails emp : empDetailSet) {
			dataForDesignationMap(emp);
		}
		return designationMap;
	}

	public Map<Integer, Integer> numberOfEmployeeByDepartmentNumber() {
		Set<EmployeeDetails> empDetailSet = dataParser.getEmpDataSet();
		// Map<Integer, Integer> departmentIdMap = new HashMap<>();
		for (EmployeeDetails emp : empDetailSet) {
			dataForDepartmentIdMap(emp);
		}
		return departmentIdMap;
	}

	public void dataForDepartmentIdMap(EmployeeDetails empDetail) {

		if (departmentIdMap.get(empDetail.getDepartmentId()) == null) {
			departmentIdMap.put(empDetail.getDepartmentId(), 1);
		} else {
			int cnt = departmentIdMap.get(empDetail.getDepartmentId());
			cnt++;
			departmentIdMap.put(empDetail.getDepartmentId(), cnt);
		}
	}

	public void dataForDesignationMap(EmployeeDetails empDetail) {

		if (designationMap.get(empDetail.getDesignation()) == null) {
			designationMap.put(empDetail.getDesignation(), 1);
		} else {
			int cnt = designationMap.get(empDetail.getDesignation());
			cnt++;
			designationMap.put(empDetail.getDesignation(), cnt);
		}
	}
}
