package com.revature.models;

public class Employee extends User {
	

	public boolean isEmployee;
	private boolean isAdmin;
	private String username;
	
	User person;
	public Employee(boolean isEmployee, boolean isAdmin) {
		this.isEmployee = true;
		this.isAdmin = isAdmin;
	}
	
	public Employee(String username) {
		this.username = username;
	}
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	@Override
	public String toString() {
		return "Hello " + person.getRealname() + "Your id is: " + username + ".";
		
	}
}
