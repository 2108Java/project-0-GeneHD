package com.revature.repo;

import java.util.List;

import com.revature.models.Account;
import com.revature.models.Employee;
import com.revature.models.User;

public interface BankDAO {

	public User userLogin();
	
	boolean authenticate();
	
	public List<Account> getAccounts(int ... id);
	
	public Account addAccount();
	
	public List<Account> viewAllAccounts();
	
	Account viewAccount(int account_id);

	double viewBalance(int account_id);
	
	double deposit(int account_id);
	
	double withdrawal(int account_id);
	
	double transferFunds(int from, int to);
	
	
	
	
	
}
