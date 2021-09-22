package com.revature.views;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.revature.service.BankServiceImp;
import com.revature.models.Account;
import com.revature.models.Customer;
import com.revature.models.User;
import com.revature.repo.AccountDao;
import com.revature.service.Auditor;

public class CustomerMenu implements Menu {

	User user = new User();
	private AccountDao aDao;

	public CustomerMenu() {
		
	}
	public CustomerMenu(User user) {
		this.user = user;
	}
	public void bankMenu() {
		
		Scanner sc = new Scanner(System.in);
		BankServiceImp service = new BankServiceImp(aDao);
		boolean banking = true;
		
		while (banking) {
			
		// System.out.println("Hello " + (customer first name) + "!");
		System.out.println("Please select an option: ");
		System.out.println("1) Make a new account");
		System.out.println("2) View your accounts");
		System.out.println("3) Make a deposit");
		System.out.println("4) Make a withdrawal");
		System.out.println("5) Request a transfer");
		System.out.println("6) Exit");
		String option = sc.nextLine();
		
		switch(option) {
		
		case "1": 
			// get the user, add an account type and send them to the service.
			
			String username = user.getUsername();
			
			System.out.println("What kind of Account would you start " + user.getRealname() + "?");
			System.out.println("1) Checking, 2) Savings");
			
			boolean choosing = true;
			
			String accountType = sc.nextLine();
			
			while(choosing) { 
			
				switch(accountType) {
			
				case "1" : 
					accountType = "Checking";
					choosing = false;
					break;
			
				case "2" :
					accountType = "Savings";
					choosing = false;
					break;
				
				default: 
					System.out.println("That's not a valid answer. Please pick '1' for checking");
					System.out.println("or '2' for savings");
				}
			}				
				
			System.out.println("How much do you want to deposit");
			
			String initDeposit = sc.nextLine();
			double startDeposit = Double.parseDouble(initDeposit);
			service.makeAccount(username, accountType, startDeposit);
			
			break;
			
		case "2":
			
			service.viewAccounts(user);
			
			break;
			
		case "3":
			
			System.out.println("Your balance is now: ");
			System.out.println("How much would you like to deposit?");
			String pendDeposit = sc.nextLine();
			double deposit = Double.parseDouble(pendDeposit);
			
			
		//	service.deposit(user.getUsername(), balance, deposit);
			
			
			break;
		case "4":
			System.out.println("Your balance is now: ");
			System.out.println("How much would you like to deposit?");
			
			String pendWithdrawal = sc.nextLine();
			double withdrawal = Double.parseDouble(pendWithdrawal);
			
	//	service.withdrawal(option, 0);
			break;
		case "5":
			
			service.makeTransfer(option, option, 0);
			
			break;
			
		case "6":
			System.out.println("Thank you for choosing Eggman Bank!");
			System.out.println("Good bye!");
			banking = false;
			break;
			
			default:
				System.out.println("You need to select a valid option.");
		
		}

		}
		
		sc.close();
		
	}
	
	
	@Override
	public void display() {
		
		bankMenu();
	
	}

	

}
