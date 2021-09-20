package com.revature.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDispatch {

	public static final String URL = "";
	public static final String USERNAME = "";
	public static final String PASSWORD = "";
	
	
	public ConnectionDispatch() {
		 
	}
	public void getConnetion() {
	
		try {
	Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	} catch(SQLException e) { 
		e.printStackTrace();
	}
	}
	
}
