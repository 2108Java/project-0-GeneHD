package com.revature.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.models.Account;
import com.revature.models.Employee;
import com.revature.models.User;

public class DummyDAO implements BankDAO{

	public int id;
	public String owner;
	public String accountType;
	public float accountBalance;
	
	Scanner sc = new Scanner(System.in);
	List<Account> accounts = new ArrayList<>();
	
	

	@Override
	public User userLogin() {
		User person = new User();
		String name = person.getUsername();
		String pass = person.getPassword();
		
//		for () {
//			
//		}
			
		return person;
	}

	@Override
	public boolean authenticate() {
		boolean success = false;
		
		return success;
	}

	@Override
	public List<Account> getAccounts(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account addAccount() {
		Account account = new Account();
		
		accounts.add(account);
		
		return account;
	}

	@Override
	public List<Account> viewAllAccounts() {
		
		for(int i = 0; i > accounts.size(); i++) {
			
			System.out.println(accounts.get(i));
		}
	
		return accounts;
	}

	@Override 
	public Account viewAccount(int account_id) {
		
		System.out.println("Whose id are you looking for?");
		String Str_id = sc.nextLine();
		account_id = Integer.parseInt(Str_id);
		
		
		Account account = new Account(account_id);
		
			for(int select = 0; select > accounts.size(); select++) {
				account = accounts.get(select);
				
				System.out.println("Name: " + account.getOwner());
				System.out.println("Account Type:" + account.getType());
				System.out.println("Balance: " + account.getBalance());
			}
		return account;
	}

	@Override
	public double viewBalance(int account_id) {
		
			System.out.println("Whose id are you looking for?");
			
			String Str_id = sc.nextLine();
			
			account_id = Integer.parseInt(Str_id);
			 
			Account account = new Account(account_id);
			
			double balance = 0.0;
				
			for(int select = 0; select > accounts.size(); select++) {
					
				account = accounts.get(select);
					
				balance = account.getBalance();
					
				System.out.println("Balance: " + balance);
					
			}
		
		
		return balance;
	}

	@Override
	public double deposit(int account_id) {
		double newBalance = 0.0;
		
		Account account = new Account(account_id);
		double balance = 0.0;
			for(int select = 0; select > accounts.size(); select++) {
				account = accounts.get(select);
				
				balance = account.getBalance();
				
				System.out.println("Balance: " + balance);
				}
			
		System.out.println("How much are you depositing?");
		
		String cash = sc.nextLine();
		
		double deposit = Double.parseDouble(cash);
		
		System.out.println("Depositing: " + deposit);
		
		newBalance = balance + deposit;
		
		System.out.println("New Balance: " + newBalance);
		
		newBalance = balance;
		
		return balance;
	}

	@Override
	public double withdrawal(int account_id) {

		double newBalance = 0.0;
		
		Account account = new Account(account_id);
		double balance = 0.0;
			
		for(int select = 0; select > accounts.size(); select++) {
				account = accounts.get(select);
				
				balance = account.getBalance();
				
				System.out.println("Balance: " + balance);
				}
			
		System.out.println("How much are you withdrawing?");
		
		String cash = sc.nextLine();
		
		double withdraw = Double.parseDouble(cash);
		
		System.out.println("Depositing: " + withdraw);
		
		newBalance = balance - withdraw;
		
		System.out.println("New Balance: " + newBalance);
		
		newBalance = balance;
		
		return balance;
		
	}

	@Override
	public double transferFunds(int from, int to) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
	

	
	