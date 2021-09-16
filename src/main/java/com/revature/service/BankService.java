package com.revature.service;

import java.util.List;

import com.revature.models.Account;

public interface BankService {
	
	// Creating Accounts
	public Account makeAccount();
	
	
	// Reading accounts
	
	public Account viewAccount();
	
	public List<Account> viewAccounts();
	
	// Update accounts 
	public boolean deposit();
	
	public boolean withdrawal();
	
	public boolean transferFunds();
	// Delete accounts
	
	public boolean deleteAccount();
	
	
	
	
	
	
	

	
	
}
