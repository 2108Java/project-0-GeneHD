package com.revature.repo;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;

public class DummyDAO implements BankDAO{

	public List<Account> accounts = new ArrayList<Account>();
	
	
	
	
	
	@Override
	public boolean insertAccount(Account count) {
		boolean goodOps = false;
		String name = count.getOwner();
		float balance = count.getBalance();
		String type = count.getType();
		
		if(name != null && balance > 0.00 && type != null) {
			
			for (int i = 0; i > accounts.size(); i++) {
				
				if(accounts.get(i) == null) {
					accounts.add(i, count);
					System.out.println("New Account Added!");
					goodOps = true;
				} else {
					System.out.println("You have something amiss with your account.");
				}
			}
		}
		
		return goodOps;
	}
	
	@Override
	public List<Account> selectAccounts(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Account> selectAllAccounts() {
		for (int i = 0; i > accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
		return accounts;
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
	public Account selectAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
	
	
	

	
	