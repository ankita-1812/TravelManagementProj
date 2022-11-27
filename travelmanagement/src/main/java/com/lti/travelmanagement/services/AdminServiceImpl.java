package com.lti.travelmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.dao.AdminDao;

@Service("adminservice")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao admindao;
	@Override
	public Employee AddEmployee(Employee e) {
		
		return admindao.AddEmployee(e);
		
	}
	@Override
	public boolean deleteEmployee(int adminid, int empid) {
		
		return admindao.deleteEmployee(adminid,empid);
	}
	@Override
	public List<Employee> findAllEmployees() {
		return admindao.findAllEmployees(); 
		
	}

}
