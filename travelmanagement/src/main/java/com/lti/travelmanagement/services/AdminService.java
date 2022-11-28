package com.lti.travelmanagement.services;

import java.util.List;

import com.lti.travelmanagement.beans.Employee;

public interface AdminService {

	Employee AddEmployee(Employee e);

	boolean deleteEmployee( int empid);

	List<Employee> findAllEmployees();

	Employee updateEmployee(int empId,Employee e);

	boolean updateRequestStatus(int adminId, int reqId, String adminStatus);

	boolean updateRequestExpenseStatus(int adminId, int responseId, String adminStatus);

}
