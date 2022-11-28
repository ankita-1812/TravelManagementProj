package com.lti.travelmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.dao.AdminDao;

@Service("adminservice")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	@Override
	public Employee AddEmployee(Employee e) {
		
		return adminDao.AddEmployee(e);
		
	}
	@Override
	public boolean deleteEmployee(int empid) {
		
		return adminDao.deleteEmployee(empid);
	}
	@Override
	public List<Employee> findAllEmployees() {
		return adminDao.findAllEmployees(); 
		
	}
	@Override
	public Employee updateEmployee(int empId,Employee e) {
		
		return adminDao.updateEmployee(empId,e);
	}

}
