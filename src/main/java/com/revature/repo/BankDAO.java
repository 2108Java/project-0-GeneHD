package com.revature.repo;

import java.util.List;

import com.revature.models.Account;

public interface BankDAO {

	// Create
	public Account insertAccount();
	
	// Read
	public Account selectAccount();
	
	public List<Account> selectAccounts(String owner);
	
	public List<Account> selectAllAccounts();
	
	// Update
	public Account updateAccount(String owner);
	
	// Delete
	public void deleteAccount(String owner);
	
	
}
