package com.jp.hr.services;

import com.jp.hr.daos.DaoUser;
import com.jp.hr.daos.DaoUserImpl;
import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;

public class ServiceUserImpl implements ServiceUser{
	private DaoUser daoUser;

	public ServiceUserImpl() throws HrException{
		daoUser = new DaoUserImpl();
	}
	
	@Override
	public User getUserDetails(String userId) throws HrException {
		return daoUser.getUserDetails(userId);
	}

	@Override
	public User authenticateUser(String userId,String password) throws HrException {
		User user = daoUser.getUserDetails(userId);
		if(user.getPassword().equals(password)){
			return user;
		}
		else{
			return null;
		}
	}

}
