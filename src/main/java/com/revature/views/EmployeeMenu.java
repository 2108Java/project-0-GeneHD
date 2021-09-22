package com.revature.views;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.service.BankServiceImp;
 

public class EmployeeMenu implements Menu {

	
	BankServiceImp service = new BankServiceImp();
	User u;
	
	public EmployeeMenu(User u) {
		this.u = u;
	}

	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select your option.");
		System.out.println("1) View the customer's account");
		System.out.println("2) Send a transfer.");
		System.out.println("3) Approve a transfer.");
		System.out.println("4) View the log.");
		
		
		
		String option = sc.nextLine();
		
		switch(option) {
		
		case "1": 
			
			
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
		
		
		sc.close();
	}

	
		

}
