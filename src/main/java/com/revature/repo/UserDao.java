package com.revature.repo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.User;
import com.revature.utilities.ConnectionDispatch;

public class UserDao {
 
	
	ConnectionDispatch dispatch = new ConnectionDispatch();
	
	//Create a User
	public boolean insertUser(String username, String password, String fullname)  {
		
		boolean goodOps = false;
		PreparedStatement ps;
		String sql = "INSERT INTO user_table(username, user_password, user_fullname, emp_account, is_admin) VALUES (?, ?, ?, ?, ?)";
		
		try {
		Connection conn = dispatch.getConnection();
		
		
		ps = conn.prepareStatement(sql);
		
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, fullname);
		ps.setBoolean(4, false);
		ps.setBoolean(5, false);
		
		ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goodOps = true;
		return goodOps;
	}
	
	
	// Reading a user.
	public User selectUserByUserName(String username) {
		String sql = "SELECT * FROM user_table WHERE username = ?";
		User u = new User();
		PreparedStatement ps;
		
		
		try {
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				u.setId(rs.getInt("user_id"));
				u.setPassword(rs.getString("user_password"));
				u.setUsername(rs.getString("username"));
				u.setRealname(rs.getString("user_fullname"));
				u.setEmployee(rs.getBoolean("emp_account"));
				
			}
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return u;
	}
	
	// Updating a user
	public boolean updateUser(String username) {
		
		return false;
	}
	
	// Deleting a user
	public boolean deleteUser(String username) {
		
		return false;
	}
	
}
			
			
			
			

			
			
			
				
				

