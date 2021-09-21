package com.revature.views;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.models.User;
import com.revature.service.Auditor;
import com.revature.service.Authenticator;
import com.revature.service.BankServiceImp;


public class MainMenu implements Menu {
	
private Authenticator audit;
private BankServiceImp service;

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
		System.out.println("or type '0' to register for a new account.");
			
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
			System.out.println("Try again!");
			
		}

			
		
		return u;
	}
	
	public User registerMenu(Scanner sc) {
		User u = null;
		System.out.println("Welcome to the register menu!");
		System.out.println("Please enter a username, new customer: ");
		
		String newUsername = sc.nextLine();
		
		
		System.out.println("Ok. now enter your new password: ");
		 
		String newPassword = sc.nextLine();
		
		System.out.println("Please enter your name:");
		
		String newName = sc.nextLine();
		
		System.out.println("Now how much are you depositing?");
		
		String balance = sc.nextLine();
		double newBalance = Double.parseDouble(balance);
		
		Auditor audit = new Auditor();
		BankServiceImp service = new BankServiceImp();
		
			try {
				if(audit.authenticate(newUsername)) {
					service.makeUser(newUsername, newPassword, newName);
					service.makeAccount(newName, newBalance);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return u;
	}	
 
	

	
	

}
