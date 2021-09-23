package com.revature.views;


import java.util.List;
import java.util.Scanner;

import com.revature.models.Account;
import com.revature.models.User;

import com.revature.service.Authenticator;
import com.revature.service.BankService;
import com.revature.service.BankServiceImp;


public class MainMenu implements Menu {
	
private Authenticator audit;
private BankService service;
private CustomerMenu cMenu;
private EmployeeMenu eMenu;


public MainMenu() {
		
	}
	public MainMenu(Authenticator audit) {
		this.audit = audit;
		
	}

	Scanner sc = new Scanner(System.in);
	
	public void greeting() {
		System.out.println("Welcome to Eggman Bank!");
	}
	
	public void display() {
		
		greeting();
		
		loginMenu(sc);
		
		sc.close();
	}
	
	public User loginMenu(Scanner sc) {

			
		System.out.println("Please enter your username:");
		
		String username = sc.nextLine(); 
	
		
		System.out.println("Now enter your password for " + username + ":" );
		String password = sc.nextLine();

		boolean audited = audit.authenticate(username, password);
		User u = null;
		List<Account> ac = null;
		
		if(audited) {
			u = audit.getUser(username);
			
			System.out.println("welcome " + username + ".");
			
			boolean emp = u.isEmployee();
			
			if(emp) {
				eMenu = new EmployeeMenu(u);
				eMenu.display();
			}else {
				cMenu = new CustomerMenu(u);
				cMenu.display();
			}
				
		}else{
			
			System.out.println("You have not entered the right password.");
			System.out.println("Try again or press '0' to register!");
			String zero = sc.nextLine();
			
			switch (zero) {
			case "0": 
				registerMenu(sc); 
				break;
			default: 
				loginMenu(sc);
			}
		}

			
		
		return u;
	}
	
	public boolean registerMenu(Scanner sc) {
		boolean goodOps = false;
		System.out.println("Welcome to the register menu!");
		System.out.println("Please enter a username, new customer: ");
		
		String username = sc.nextLine();
		
		
		System.out.println("Ok. now enter your new password: ");
		 
		String password = sc.nextLine();
		
		System.out.println("Please enter your name:");
		
		String fullName = sc.nextLine();	
		
		
		boolean audited = audit.authenticate(username, password, fullName);

		
				if(audited) {
					goodOps = audit.makeUser(username, password, fullName);
					
					
					//service.makeAccount(newName, newBalance);
				}
			
		return goodOps;
	}	
 
	

	
	

}
