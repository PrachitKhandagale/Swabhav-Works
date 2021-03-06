package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {
	
	private static List<Department> deptList;
	private Connection con;
	
	public DepartmentRepository() throws SQLException {
		deptList = new ArrayList<Department>();
		con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
		
	}
	
	public boolean addToDept(Department dept) {
		if (dept != null) {
			try {
				//con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
				PreparedStatement stmt = con.prepareStatement("insert into dept values(?,?,?)");
				stmt.setString(1, dept.getDeptno());
				stmt.setString(2, dept.getDname());
				stmt.setString(3, dept.getLocation());
				//ResultSet rs = stmt.executeQuery();
				int result=stmt.executeUpdate();
				System.out.println("Row Added To Deparment Table.");

				con.close();
				//rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return true;
		} else {
			return false;
		}
	}

	public List<Department> getList() {
		try {
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dept");
			while(rs.next()) {
				String deptNo = rs.getString(1);
				String deptName = rs.getString(2);
				String location = rs.getString(3);
				Department department = new Department(deptNo, deptName, location);
				deptList.add(department);
			}
			
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return deptList;
	}

}
