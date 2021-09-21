package com.revature.repo;

import java.util.List;

import com.revature.models.Account;

public interface BankDAO {

	// Create
	public boolean insertAccount(Account newAccount);
	
	// Read
	public Account selectAccount(int id);
	
	public List<Account> selectAccounts(int id);
	
	public List<Account> selectAllAccounts();
	
	// Update
	public Account updateAccount(String owner);
	
	// Delete
	public void deleteAccount(String owner);
	
	public boolean createAccount(String owner);
	
	public boolean approveAccount(String owner);
}
