package com.lti.travelmanagement.services;

import java.util.List;

import com.lti.travelmanagement.beans.Employee;

public interface AdminService {

	Employee AddEmployee(Employee e);

	boolean deleteEmployee(int adminid, int empid);

	List<Employee> findAllEmployees();

}
