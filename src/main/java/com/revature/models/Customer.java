package com.revature.models;

import java.util.List;

public class Customer extends User {
	
	
	public boolean isEmployee = false;
	private String name;
	private List<Account> accounts;
	
	public Customer(String cust_name, String name) {
		this.name = cust_name;
	}
	
	public Customer(String name, List<Account> accounts) {
		this.name = name;
		this.accounts = accounts;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
