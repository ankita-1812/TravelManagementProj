package com.lti.travelmanagement.services;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelRequest;

public interface EmployeeService {
	Employee addEmployee(Employee e);
	Employee addEmployeeRequest(int empid,TravelRequest t);
	Employee updateEmployeeRequest(int reqid, TravelRequest t);
}
