package com.revature.views;

import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.models.Employee;

public class MainMenu implements Menu {

//	Employee worker = new Employee();
//	Customer customer = new Customer();
	
	
	public void prettyDisplay() {
		
		
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
		 * if (password is good) {
		 * 			
		 * 		if(isEmployee) {
		 * 			EmployeeMenu menu = new EmployeeMenu();
		 * 						menu.display();
		 * 
		 * 	`	} else {
		 * 			CustomerMenu option = new CustomerMenu();
		 * 						option.display();
		 * 			}
		 * }
		 * 
		 * 		if the username is an employee, use the employee menu.
		 * 
		 * 		if not use the customer menu.
		 * }
		 */

		
		sc.close();
		
		
		
	}


}
