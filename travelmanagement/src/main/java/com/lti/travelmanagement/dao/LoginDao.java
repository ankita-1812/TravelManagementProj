package com.lti.travelmanagement.dao;

import com.lti.travelmanagement.beans.Admin;
import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.exceptions.InvalidUserException;

public interface LoginDao {

	boolean updatePassword(String userName, Login login);

	Employee checkEmployeeExist(String userName, String password, String userType)throws InvalidUserException ;

	 Admin checkAdminExist(String userName, String password, String userType) throws InvalidUserException ;

}
