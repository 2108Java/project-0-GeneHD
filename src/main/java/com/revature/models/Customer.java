package com.revature.models;

import java.util.List;

import com.revature.repo.AccountDao;


public class Customer extends User {
	
	User person;
	public boolean isEmployee;
	private List<Account> accounts;
	private String username;
	
	AccountDao accountBank = new AccountDao();	
	
	public Customer() {
		
	}
	
	public Customer(String username) {
		this.username = username;
	}
	
	public Customer(int id, String name, String realname, 
			String username, String password, boolean isEmployee, 
			List<Account> accounts) {
		this.isEmployee = false;
		this.accounts = accounts;
		this.username = username;
		
	}
	public Customer(boolean isEmployee) {
		this.isEmployee = false;
	}
	
	
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public String toString() {
		return "Customer no. " + person.getId() + ": username: "+ username + 
				" Hello " + person.getRealname() + ". \n here are your accounts: " 
				+ accountBank.selectAccounts(person) + ".";
		
	}
	
	
}


