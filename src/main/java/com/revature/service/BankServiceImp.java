package com.revature.service;




import java.util.List;

import com.revature.models.Account;
import com.revature.repo.AccountDao;
import com.revature.repo.UserDao;

public class BankServiceImp {
	
	List<Account> accounts = null;
	
	private AccountDao aDao;
	private UserDao uDao;
	
	public BankServiceImp() {
		
		aDao = new AccountDao();
	}
	
	public BankServiceImp(UserDao uDao, AccountDao aDao) {
		this.aDao = aDao;
		this.uDao = uDao;
	}
		
	public BankServiceImp(AccountDao aDao2) {
		this.aDao = aDao2;
	}

	public boolean makeAccount(String newName, String accountType, double newBalance) {
		AccountDao a = new AccountDao();
		
		boolean goodOps = a.insertAccount(newName, accountType, newBalance);
		
		
		return goodOps;
	}
	
	public boolean deposit(int id, double balance, double deposit) {
		AccountDao a = new AccountDao();
		
		balance += deposit;
		
		boolean goodOps = a.updateAccount(id, balance);
		System.out.println("Your balance is now: $" + balance);
		
		return goodOps;
	}
	
	public boolean withdrawal(int id, double balance, double withdrawal) {
		AccountDao a = new AccountDao();
		
		balance -= withdrawal;
		
		boolean goodOps = a.updateAccount(id, balance);
		System.out.println("Your balance is now: $" + balance);
		
		return goodOps;
	}
	
	public boolean makeTransfer(String from, String to, double amount) {
//		AccountDao a = new AccountDao();
		boolean goodOps = false;
		
//		transferPool 
	//	goodOps = a.RequestTransfer(from, to ,amount);
		
		
		return goodOps;
				
				
	}
	
	public boolean approveTransfer() {
		boolean goodOps = false;
		
		
		return goodOps;
	}

	public List<Account> viewAllAccounts() {
		AccountDao ad = new AccountDao();
		
		List<Account> dossier = ad.selectAllAccounts();
		
		return dossier;
	}
	
	public List<Account> viewAccounts(int id) {
		
		AccountDao a = new AccountDao();
		
		List<Account> list = a.selectAccounts(id);
	
		
		return list;
	}

	public boolean rejectUser(String realname) {
		
		UserDao user = new UserDao();
		boolean goodOps = false;
		
		goodOps = user.deleteUser(realname);
		if(goodOps) {
			System.out.println("User " + realname + "has been deleted");
		} else {
			System.out.println("User has not been deleted.");
		}
		return goodOps;
	}
	
	
}

