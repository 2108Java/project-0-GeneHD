package com.revature.service;




import com.revature.models.User;
import com.revature.repo.AccountDao;
import com.revature.repo.UserDao;
import com.revature.views.CustomerMenu;
import com.revature.views.EmployeeMenu;

public class Auditor implements Authenticator {
	private UserDao userDao;
	private AccountDao accDao;
	CustomerMenu cMenu;
	EmployeeMenu eMenu;

	public Auditor(AccountDao aDao, UserDao uDao) {
		this.accDao = aDao;
		this.userDao = uDao;
	}
	public Auditor() {
		
	}

	@Override
	public boolean authenticate(String username, String password) {
		
		User person = getUser(username);
		boolean goodOps = false;
		
		if (person != null) {
			
			if(person.getPassword() != null && person.getPassword().equals(password)) {
			
				goodOps = true;
			} 
		}
			
			return goodOps;
	}

	public boolean authenticate(String username, String password, String fullname) {
		boolean goodOps = false;
		
		goodOps =  makeUser(username, password, fullname);
		
				if(username != null) {
								
					System.out.println("Getting you a the username " + username + ".");
					System.out.println("Success!");
					goodOps = true;
					
					cMenu = new CustomerMenu();
					cMenu.display();
				}else {
				
					System.out.println("Someone else has the username:" + username + ".");
				
					System.out.println("Try another username.");
					
				}
				return goodOps;
		}
	@Override	
	public boolean makeUser(String username, String password, String fullname) {
		boolean goodOps = false;
		
		 goodOps = userDao.insertUser(username, password, fullname);
		
		return goodOps;
	}
	@Override
	public User getUser(String username) {
		
		User u = userDao.selectUserByUserName(username);
		
		return u;
	}

}
