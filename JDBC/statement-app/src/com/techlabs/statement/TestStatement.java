package com.techlabs.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dept");
			System.out.println("DEPTNO"+"\t"+"DNAME"+"\t\t"+"LOCATION");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) 
				+ "\t" + rs.getString(3));
				//System.out.println(rs.getInt("DEPTNO") + "\t" + rs.getString("DNAME") + "\t" + rs.getString("LOC"));
			}
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
