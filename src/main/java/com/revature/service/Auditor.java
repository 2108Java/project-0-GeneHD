package com.revature.service;

import java.sql.SQLException;


import com.revature.models.User;
import com.revature.repo.AccountDao;
import com.revature.repo.UserDao;

public class Auditor implements Authenticator {
	private UserDao userDao;
	private AccountDao accDao;

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

	public boolean authenticate(String username) throws SQLException {
		boolean goodOps = false;
		User person = getUser(username);
		
				
				if(username != null && !person.getUsername().equals(username)) {
				
				
					userDao.createUser(username);
					userDao.updateUser(username);
				
					goodOps = true;
				
					

				}else {
				
					System.out.println("Someone else has the username:" + username);
				
					System.out.println("Try another username.");
					

				}
				return goodOps;
		}
		
	@Override
	public User getUser(String username) {
		
		User u = userDao.selectUserByUserName(username);
		
		return u;
	}

}
