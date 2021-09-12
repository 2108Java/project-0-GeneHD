package com.revature.repo;

import com.revature.models.Account;
import com.revature.models.User;

public interface BankDAO {

	User userLogin();
	
	Account[] selectAccounts();
	
	Account makeAccount();
	
	Account viewAllAccounts();
	
	Account viewAccount(int account_id);

	double viewBalance(int account_id);
	
	double deposit(int account_id);
	
	double withdrawal(int account_id);
	
	double transferFunds(int from, int to);
	
	
	
	
	
}
