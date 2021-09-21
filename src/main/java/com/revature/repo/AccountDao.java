package com.revature.repo;

import java.util.List;

import com.revature.models.Account;
import com.revature.utilities.ConnectionDispatch;

public class AccountDao implements BankDAO {

	@Override
	public boolean insertAccount(Account newAccount) {
		
		
		boolean goodOps = false;
		
		

		return goodOps;
	}

	@Override
	public Account selectAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> selectAccounts(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> selectAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAccount(String owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(String owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean createAccount(String owner) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean approveAccount(String owner) {
		// TODO Auto-generated method stub
		return false;
	}

}
