package com.revature.repo;

import com.revature.models.Account;
import com.revature.models.Employee;
import com.revature.models.User;

public class DummyDAO implements BankDAO{

	@Override
	public User userLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] selectAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account makeAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account viewAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account viewAccount(int account_id) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public User authenticate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee loginEmp() {
		// TODO Auto-generated method stub
		return null;
	}

}
