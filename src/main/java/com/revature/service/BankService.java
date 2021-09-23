package com.revature.service;

import java.util.List;

import com.revature.models.Account;
import com.revature.models.User;

public interface BankService {
	
	public List<Account> viewAccounts(User user);
	
	public boolean makeAccount(String newName, String accountType, double newBalance);
	
	public double deposit(String owner, double balance);
	
	public double withdrawal(String owner, double balance);
	
	public boolean makeTransfer(String from, String to, double amount);
	
	public boolean approveTransfer();
	
}
