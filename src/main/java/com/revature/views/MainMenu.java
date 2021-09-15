package com.revature.views;

import java.util.Scanner;

public class MainMenu implements Menu {

	public void prettyAccountDisplay() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Eggman Bank! \n Please enter your username!");
		String username = sc.nextLine();
		
		System.out.println("Now enter your password " + username + ":" );
		
		String passAtt = sc.nextLine();
		
		/*
		 * 
		 * if (passAtt = username's password) {
		 * 			
		 * 		if the username is an employee, use the employee menu.
		 * 
		 * 		if not use the customer menu.
		 * }
		 */

		
		sc.close();
		
		
		
	}


}
