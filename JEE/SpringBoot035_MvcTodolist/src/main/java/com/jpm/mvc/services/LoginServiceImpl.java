package com.jpm.mvc.services;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	public boolean authenticateUser(String userName, String password) {
	    return userName.equalsIgnoreCase("abc")
	            && password.equalsIgnoreCase("123");
	}
}
