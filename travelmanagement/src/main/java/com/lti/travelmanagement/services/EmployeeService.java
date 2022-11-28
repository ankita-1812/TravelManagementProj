package com.lti.travelmanagement.services;

import java.util.List;
import java.util.Set;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.beans.TravelRequest;

public interface EmployeeService {
	Employee addEmployee(Employee e);
	Employee addEmployeeRequest(int empid,TravelRequest t);
	Employee updateEmployeeRequest(int reqid, TravelRequest t);
	Set<TravelRequest> findAllTravelRequests(int empid);
	boolean deleteTravelRequest(int reqId);
	boolean addEmployeeExpense(int empId, int reqId,TravelExpense travelExpense);
	boolean updateEmployeeExpense(int travelExpenseId, TravelExpense travelExpense);
	boolean deleteEmployeeExpense(int expenseId);
}
