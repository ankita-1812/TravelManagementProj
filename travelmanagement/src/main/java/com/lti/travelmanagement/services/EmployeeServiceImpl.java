package com.lti.travelmanagement.services;

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
	
}
