package com.revature.models;

import java.util.List;

public class Customer extends User {
	private String name;
	private List<Account> accounts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}