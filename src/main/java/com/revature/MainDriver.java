package com.revature;

import com.revature.repo.AccountDao;
import com.revature.repo.UserDao;
import com.revature.service.Auditor;
import com.revature.service.Authenticator;
//import com.revature.service.BankServiceImp;
import com.revature.views.MainMenu;

public class MainDriver {

	public static void main(String[] args) {
		
		UserDao uDao = new UserDao();
		
		AccountDao aDao = new AccountDao();
		
		Authenticator audit = new Auditor(aDao,uDao);
		
//	System.out.println(audit.getUser("scratch"));
//		BankService service = new BankServiceImp();
//		System.out.println(uDao.selectUserByUserName("eggman1"));		
		
		MainMenu menu = new MainMenu(audit);

		menu.display();
	}
}
