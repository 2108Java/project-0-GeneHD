package com.revature.models;

public class Employee extends User {

	
	private boolean isAdmin;

	 
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
