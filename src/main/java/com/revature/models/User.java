package com.revature.models;

public class User {

	private String username;
	private String password;
	private boolean isEmployee;
	
	public User(String name, boolean isEmployee) {
		this.username = name;
		this.isEmployee = isEmployee;
	}
	
	public User(String name, String pass, boolean isEmployee) {
		this.username = name;
		this.password = pass;
		this.isEmployee = isEmployee;
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
	public boolean isEmployee() {
		return isEmployee;
	}
	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	
	
	
	
}
