package com.revature.service;

import java.sql.SQLException;

import com.revature.repo.AccountDao;
import com.revature.repo.UserDao;

public class BankServiceImp {
	
	private UserDao uDao;
	private AccountDao aDao;
	
	public BankServiceImp() {
		
	}
	
	public BankServiceImp(UserDao uDao, AccountDao aDao) {
		this.uDao = uDao;
		this.aDao = aDao;
	}

	public void makeUser(String newUsername, String newPassword, String newName) throws SQLException{
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

