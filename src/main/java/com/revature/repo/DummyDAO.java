package com.revature.repo;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;
import com.revature.models.Employee;
import com.revature.models.User;

public class DummyDAO implements BankDAO{

	public int id;
	public String owner;
	public String accountType;
	public float accountBalance;
	
	List<Account> accounts = new ArrayList(); 
	

	@Override
	public User userLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account makeAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> viewAllAccounts() {
	
		return accounts;
	}

	@Override
	public Account viewAccount(int account_id) {
		Account account = new Account();
		
			for(int select = 0; select > accounts.size(); select++) {
			}
		return account;
	}

	@Override
	public double viewBalance(int account_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposit(int account_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdrawal(int account_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double transferFunds(int from, int to) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
	

	
	