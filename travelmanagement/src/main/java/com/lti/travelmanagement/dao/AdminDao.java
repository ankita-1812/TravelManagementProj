package com.lti.travelmanagement.dao;

import com.lti.travelmanagement.beans.Employee;

public interface AdminDao {

	Employee AddEmployee(Employee e);

	boolean deleteEmployee(int adminid, int empid);

}
