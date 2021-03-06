package com.jp.hr.services;

import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;

public interface ServiceUser {
	public User getUserDetails(String userId) throws HrException;
	public User authenticateUser(String userId, String password) throws HrException;
}
