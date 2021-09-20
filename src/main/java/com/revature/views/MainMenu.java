package com.revature.views;

import java.util.Scanner;

import com.revature.service.Auditor;
import com.revature.service.BankService;
import com.revature.service.BankServiceImp;


public class MainMenu implements Menu {

	Scanner sc = new Scanner(System.in);
	
	public void greeting() {
		System.out.println("Welcome to Eggman Bank!");
	}
	
	public void loginMenu() {

		
		
		boolean run = true;
		
		while (run) {
			System.out.println("Please enter your username:");
			System.out.println("or type 'register' to register for a new account.");
			
			String username = sc.nextLine(); 
			if(username == "register") {
				registerMenu();
				
			}
			System.out.println("Now enter your password for " + username + ":" );
		
			String passAtt = sc.nextLine();
		
		Auditor audit = new Auditor();
		
			audit.authenticate(username, passAtt);
		
			
		}
			
		
		
	}
	
	public void registerMenu() {
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
		
			if(audit.authenticate(newUsername)) {
				service.makeUser(newUsername, newPassword, newName);
				service.makeAccount(newName, newBalance);
			}
		
	}
		@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		 
		greeting();
		
		loginMenu();
		
		registerMenu();
		
		sc.close();
	}
 
	public MainMenu() {
		
	}

	
	

}
