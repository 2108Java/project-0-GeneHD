package com.revature.models;

public class User {

	private int id;
	private String username;
	private String password;
	
	private String realname;
	private boolean isEmployee;
	
	
	public User(String username, boolean isEmployee) {
		this.username = username;
		this.setEmployee(isEmployee);
	}
	
	public User(int id, String username, String password, String realname, boolean isEmployee) {
		this.username = username;
		this.password = password;
		this.setEmployee(isEmployee);
		this.id = id;
		this.realname = realname;
	}
	public User() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public boolean isEmployee() {
		return isEmployee;
	}

	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	
	
	@Override 
	public String toString() {
		return "User [id = " + id + ", username: " + username + ", password: " + password + " name: " + realname +"";
	}
	
}
