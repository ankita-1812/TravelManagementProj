package com.lti.travelmanagement.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.dao.EmployeeDaoImpl;

@Service("empservice")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoImpl employeedao;
	public EmployeeServiceImpl() {
	
	}

	@Override
	public Employee addEmployee(Employee e) {
		return employeedao.addEmployee(e);
		
	}

	@Override
	public Employee addEmployeeRequest(int empid,TravelRequest t) {
		return employeedao.addEmployeeRequest(empid,t);
	}

	@Override
	public Employee updateEmployeeRequest(int reqid, TravelRequest t) {
		
		return employeedao.updateEmployeeRequest(reqid,t);
	}

	@Override
	public Set<TravelRequest> findAllTravelRequests(int empid) {
		
		return employeedao.findAllTravelRequests(empid);
	}

	

	


	
	
}
