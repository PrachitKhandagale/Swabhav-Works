package com.techlabs.repository;

import java.sql.SQLException;
import java.util.List;

public class TestRepository {

	public static void main(String[] args) throws SQLException{
		
		
		
		Department department=new Department("60", "TECH", "SRILANKA");
		DepartmentRepository deptRepository=new DepartmentRepository();
		//deptRepository.addToDept(department);
		List<Department> departmentList = deptRepository.getList();
		System.out.println("DEPTNO"+"\t"+"DNAME"+"\t\t"+"LOCATION");
		for(Department dept:departmentList) {
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLocation());
		}
	}
}
