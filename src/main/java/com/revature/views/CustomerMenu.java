package com.revature.views;

import java.util.Scanner;

public class CustomerMenu implements Menu {

	
	
	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		
		// System.out.println("Hello " + (customer first name) + "!");
		System.out.println("Please select an option: ");
		System.out.println("1) Make a new account");
		System.out.println("2) View your accounts");
		System.out.println("3) Make a deposit");
		System.out.println("4) Make a withdrawal");
		System.out.println("5) Request a transfer");
		
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
		case "5":
			break;
			default:
				System.out.println("You need to select a valid option.");
		
		
		}
		
		sc.close();
	}

	

}
