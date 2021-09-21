package com.revature.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDispatch {

	
	private static final String URL = "jdbc:postgresql://localhost/postgres";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "t4500gtt";
	
	
	public ConnectionDispatch() {
		 
	}
	public Connection getConnection() throws SQLException{
		
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	
		return conn;
	
	}
	
}
