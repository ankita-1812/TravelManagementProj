package com.lti.travelmanagement.dao;

import java.util.List;

import com.lti.travelmanagement.beans.Employee;

public interface AdminDao {

	Employee AddEmployee(Employee e);

	boolean deleteEmployee( int empid);

	List<Employee> findAllEmployees();

	Employee updateEmployee(int empId,Employee e);

	boolean updateRequestStatus(int adminId, int reqId, String adminStatus);

	boolean updateRequestExpenseStatus(int adminId, int responseId, String adminStatus);

	
}
