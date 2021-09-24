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
		
			System.out.println("Please select your option.");
			System.out.println("1) View the customer's account");
			System.out.println("2) Send a transfer.");
			System.out.println("3) Approve or reject a transfer.");
			System.out.println("4) View the log.");
			System.out.println("5) Exit");
		
			String option = sc.nextLine();

			switch(option) {
		
			case "1": 
		
				accounts = service.viewAllAccounts();
				System.out.println("Here are the accounts: \n" + accounts.toString());
		
				break;
		
			case "2":
		
				break;
			
			case "3": 
		
				break;
			
			case "4":
				
				break;
			default: 
			System.out.println("You need to pick a valid option.");
		
			}
			
		}
		sc.close();
	}

	
		

}
