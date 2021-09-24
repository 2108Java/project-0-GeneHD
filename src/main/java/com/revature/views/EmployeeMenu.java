package com.revature.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.service.BankServiceImp;
 

public class EmployeeMenu implements Menu {

	
	BankServiceImp service = new BankServiceImp();
	User u;
	List<Account> accounts = new ArrayList<>();
	
	public EmployeeMenu(User u) {
		this.u = u;
	}

	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		boolean working = true;
		
		while(working) {
			System.out.println("Welcome " + u.getRealname());
			System.out.println("Please select your option.");
			System.out.println("1) View all customer accounts");
			System.out.println("2) Approve or reject an account.");
			System.out.println("3) Make or approve a transfer.");
			System.out.println("4) View the log.");
			System.out.println("5) View a customer's accounts");
			System.out.println("6) Exit");
		
			String option = sc.nextLine();

			switch(option) {
		
			case "1": 
		
				accounts = service.viewAllAccounts();
				System.out.println("Here are the accounts: \n" + accounts.toString());
		
				break;
		
			case "2":
				System.out.println("Are you looking to: \n 1) Approve a bank account or \n 2) Reject a user.");
						String choice = sc.nextLine();
						
						switch (choice) {
						case "1":
							// approve the bank account
							
						break;
						
						case "2":
							System.out.println("Who would you like to delete?");
							String username = sc.nextLine();
							
							if(username != null && u.getRealname().equals(username)) {
								
								boolean eradicate = service.rejectUser(username);
								
								if (eradicate) {
									System.out.println("done.");
								}else {
									System.out.println("Something gone wrong.");
								}
							}
						}
				break;
			
			case "3": 
				
		
				break;
			
			case "4":
				
				break;
				
			case "5":
				
				accounts = service.viewAllAccounts();
				System.out.println("Here are the accounts: \n" + accounts.toString());
				System.out.println("Please enter the id of the customer in order to.");
				
				String identify = sc.nextLine();
				int id = Integer.parseInt(identify);
							
					List<Account> ac = service.viewAccounts(id);
					System.out.println("here are the custmoer's accounts: " + ac.toString());
					
				
				break;
				
			case "6":
				System.out.println("Thanks for working!");
				working = false;
				break;
				
			default: 
			System.out.println("You need to pick a valid option.");
		
			}
			
		}
		sc.close();
	}

	
		

}
