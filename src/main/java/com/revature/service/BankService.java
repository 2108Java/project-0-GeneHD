package com.revature.service;

import com.revature.models.User;

public interface BankService {
	
	public void viewAccounts(User user);
	
	public void makeAccount(String newName, String accountType, double newBalance);
	
	public void deposit(String owner, double balance);
	
	public void withdrawal(String owner, double balance);
	
	public void makeTransfer(String from, String to, double amount);
	
	public boolean approveTransfer();
	
}
