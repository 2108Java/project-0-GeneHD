package com.revature;

import com.revature.repo.*;
import com.revature.service.BankServiceImp;
import com.revature.views.MainMenu;

public class MainDriver {

	public static void main(String[] args) {
		System.out.println("This is a test.");
		
		DummyDAO data = new DummyDAO();
		
		BankServiceImp service = new BankServiceImp();
		
		MainMenu menu = new MainMenu();

		menu.display();
	}
}
