package com.lti.travelmanagement.dao;

import java.util.List;
import java.util.Set;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelRequest;

public interface EmployeeDao {
	Employee addEmployee(Employee e);
	public Set<TravelRequest> findAllTravelRequests(int empid);
	
}
