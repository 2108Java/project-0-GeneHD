package com.revature.repo;

import java.util.List;

import com.revature.models.Account;
import com.revature.models.User;

public interface BankDAO {

	// Create
	public boolean insertAccount(Account newAccount);
	
	// Read
	public Account selectAccount(int id);
	
	public List<Account> selectAccounts(int id);
	
	public List<Account> selectAllAccounts();
	
	public List<Account> selectAccountByUsername(String owner);
	
	// Update
	public Account updateAccount(String owner);
	
	// Delete
	public void deleteAccount(String owner);
	
	public boolean insertAccount(String owner, String accountType, double newBalance);
	
	public boolean approveAccount(String owner);
	
	public double acquireBalance(int id);
}
