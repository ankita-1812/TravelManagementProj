package com.lti.travelmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.Admin;
import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.dao.LoginDao;
import com.lti.travelmanagement.exceptions.InvalidUserException;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public boolean updatePassword(String userName, Login login) {
		
		return loginDao.updatePassword(userName,login);
	}

	@Override
	public Employee checkEmployeeExist(String userName, String password, String userType)  throws InvalidUserException  {
		return loginDao.checkEmployeeExist(userName,password,userType);
		
	}

	@Override
	public Admin checkAdminExist(String userName, String password, String userType)throws InvalidUserException  {
		
		return loginDao.checkAdminExist(userName,password,userType);
	}
}
