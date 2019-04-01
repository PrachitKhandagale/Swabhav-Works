package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
		                                   "user=root&password=root");
		    System.out.println(conn.getClass());
		    System.out.println(conn.getMetaData().getDriverName());
		    System.out.println(conn.getMetaData().getDatabaseProductName());
		    System.out.println(conn.getMetaData().getUserName());
		    System.out.println(conn.getMetaData().getConnection());
		  
		} catch (SQLException ex) {
			ex.printStackTrace();
		    
		}

	}

}
