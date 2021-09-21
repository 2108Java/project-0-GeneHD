package com.revature.service;

import com.revature.models.User;

public interface Authenticator {

	boolean authenticate(String username, String password);
	boolean authenticate(String username, String password, String fullName);

	
	User getUser(String username);

	boolean makeUser(String username, String password, String fullname);

}
