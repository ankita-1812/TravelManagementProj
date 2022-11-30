package com.lti.travelmanagement.dao;

import com.lti.travelmanagement.beans.Admin;
import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.Login;

public interface LoginDao {

	boolean updatePassword(String userName, Login login);

	Employee checkEmployeeExist(String userName, String password, String userType);

	 Admin checkAdminExist(String userName, String password, String userType) ;

}
