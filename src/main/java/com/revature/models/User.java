package com.revature.models;

public class User {

	private int id;
	private String username;
	private String password;
	private String realname;
	private boolean isEmployee;
	
	
	public User(String name, boolean isEmployee) {
		this.username = name;
		this.setEmployee(isEmployee);
	}
	
	public User(int id, String name, String pass, String realname, boolean isEmployee) {
		this.username = name;
		this.password = pass;
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
	
	
	
	
}
