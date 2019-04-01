package com.techlabs.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestSqlInjection {

	public static void main(String[] args) {
		String deptid;
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Department Id:");
			deptid=sc.nextLine();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			PreparedStatement stmt=con.prepareStatement("select * from dept where deptno=?");
			stmt.setString(1,deptid);  
			
			ResultSet rs = stmt.executeQuery();
			//Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from dept where deptno="+deptid);
			System.out.println("DEPTNO"+"\t"+"DNAME"+"\t"+"LOCATION");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) 
				+ "\t" + rs.getString(3));
			}
			
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
