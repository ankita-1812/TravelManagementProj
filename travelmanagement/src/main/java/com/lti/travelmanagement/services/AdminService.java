package com.lti.travelmanagement.services;

import java.util.List;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.exceptions.AdminNotFoundException;

public interface AdminService {

	Employee AddEmployee(Employee e);

	boolean deleteEmployee( int empid);

	List<Employee> findAllEmployees();

	Employee updateEmployee(int empId,Employee e);

	boolean updateRequestStatus(int adminId, int reqId, String adminStatus) throws AdminNotFoundException;

	boolean updateRequestExpenseStatus(int adminId, int responseId, String adminStatus);

}
