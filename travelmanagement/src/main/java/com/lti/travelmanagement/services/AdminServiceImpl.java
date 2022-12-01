package com.lti.travelmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.dao.AdminDao;
import com.lti.travelmanagement.exceptions.AdminNotFoundException;

@Service("adminService")
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
	@Override
	public boolean updateRequestStatus(int adminId, int reqId, String adminStatus) throws AdminNotFoundException{
		
		return adminDao.updateRequestStatus(adminId,reqId,adminStatus);
	}
	@Override
	public boolean updateRequestExpenseStatus(int adminId, int responseId, String adminStatus) {
		
		return adminDao.updateRequestExpenseStatus(adminId,responseId,adminStatus);
	}

}
