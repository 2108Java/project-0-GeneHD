package com.revature.views;


import java.util.Scanner;

import com.revature.models.User;

import com.revature.service.Authenticator;
import com.revature.service.BankServiceImp;


public class MainMenu implements Menu {
	
private Authenticator audit;
//private BankServiceImp service;

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
		
		if(audited) {
			u = audit.getUser(username);
			
				System.out.println("welcome " + username + ".");
			
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
		
		System.out.println("Now how much are you depositing?");
		
		String balance = sc.nextLine();
		double newBalance = Double.parseDouble(balance);
		
		boolean audited = audit.authenticate(username, password, fullName);
		User u = null;
//		BankServiceImp service = new BankServiceImp();
		
				if(audited) {
					goodOps = audit.makeUser(username, password, fullName);
					System.out.println("Username " + username + "");
					goodOps = true;
					
					//service.makeAccount(newName, newBalance);
				}
			
		return goodOps;
	}	
 
	

	
	

}
