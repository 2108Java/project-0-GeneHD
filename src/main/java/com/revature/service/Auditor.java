package com.revature.service;

import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.models.Employee;
import com.revature.models.User;
import com.revature.repo.AccountDao;
import com.revature.repo.UserDao;
import com.revature.views.CustomerMenu;
import com.revature.views.EmployeeMenu;
import com.revature.views.MainMenu;

public class Auditor implements Authenticator {
	private UserDao userDao;
	private AccountDao accDao;
	private MainMenu menu;
	private EmployeeMenu eMenu;
	private CustomerMenu cMenu;

	@Override
	public boolean authenticate(String username, String password) {
		
		User person = getUser(username);
		boolean goodOps = false;
		
		if(person.getUsername() != null && !person.getUsername().equals(username)) {
			System.out.println("There is no one by the username " + username +".");
			System.out.println("Would you like to register instead? (y/n"); 
			
			Scanner sc = new Scanner(System.in);
			
			String answer = sc.nextLine();
			
			switch (answer) {
			
			case "y" :
				menu.registerMenu();
				break;
				
			case "n" :
				menu.loginMenu();
			}
			sc.close();
		}
		
		if (person.getPassword() != null && person.getPassword().equals(password)) {
			goodOps = true;
			
			if(person.isEmployee()) {
				
				eMenu.display();
			}else {
				cMenu.display();
			}
			
		} else {
			System.out.println("You have not entered the right password.");
			System.out.println("Try again!");
			menu.loginMenu();
		}
		
			
		
		return goodOps;
	}

	public boolean authenticate(String username) {
		boolean goodOps = false;
		User person = getUser(username);
		boolean run = true;
		while (run) {
		
			if(username != null && !person.getUsername().equals(username)) {
			
			
				userDao.createUser(username);
				userDao.updateUser(username);
			
				goodOps = true;
			
				run = false;
		
			}else {
			
				System.out.println("Someone else has the username:" + username);
			
				System.out.println("Try another username.");
		}
		}
		
		return goodOps;
	}
	@Override
	public User getUser(String username) {
		User u = userDao.selectUserbyUserName(username);
		
			if (!u.isEmployee()) {
				Customer c = new Customer(username);
				
				c.setAccounts(accDao.selectAccounts(c.getId()));
				
			}else {
				Employee e = new Employee(username);
				
				
			}
		return u;
	}

}
