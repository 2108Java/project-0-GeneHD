package com.revature.views;

import java.util.Scanner;

public class EmployeeMenu implements Menu {

	@Override
	public void prettyDisplay() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select your option.");
		System.out.println("1) View the customer's account");
		System.out.println("2) Send a transfer.");
		System.out.println("3) Approve a transfer.");
		
		
		
		String option = sc.nextLine();
		
		switch(option) {
		
		case "1": 
			break;
			
		case "2":
			break;
		
		case "3": 
			break;
			
		default: 
			System.out.println("You need to pick a valid option.");
		}
		
		
		sc.close();
	}

	
		

}
