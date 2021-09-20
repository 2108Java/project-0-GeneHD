package com.revature.service;

import com.revature.repo.AccountDao;
import com.revature.repo.DummyDAO;
import com.revature.repo.UserDao;

public class BankServiceImp {
	
	private UserDao uDao;
	private AccountDao aDao;
	
	public BankServiceImp() {
		
	}
	
	public BankServiceImp(DummyDAO data) {
		
	}

	public void makeUser(String newUsername, String newPassword, String newName) {
		uDao.createUser(newUsername);
		
	}

	public void makeAccount(String newName, double newBalance) {
		aDao.createAccount(newName);
		
	}
	
	public void deposit(String owner, double balance) {
		
	}
	
	public void withdrawal(String owner, double balance) {
		
	}
	
	public void makeTransfer(String from, String to, double amount) {
		
	}
	
	public boolean approveTransfer() {
		
		return false;
	}
}

