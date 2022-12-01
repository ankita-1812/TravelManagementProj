package com.lti.travelmanagement.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.dao.EmployeeDaoImpl;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoImpl employeeDao;
	public EmployeeServiceImpl() {
	
	}

	@Override
	public Employee addEmployee(Employee e) {
		return employeeDao.addEmployee(e);
		
	}

	@Override
	public Employee addEmployeeRequest(int empid,TravelRequest t) {
		return employeeDao.addEmployeeRequest(empid,t);
	}

	@Override
	public Employee updateEmployeeRequest(int reqid, TravelRequest t) {
		
		return employeeDao.updateEmployeeRequest(reqid,t);
	}

	@Override
	public Set<TravelRequest> findAllTravelRequests(int empid) {
		
		return employeeDao.findAllTravelRequests(empid);
	}

	@Override
	public boolean deleteTravelRequest(int reqId) {
		return employeeDao.deleteTravelRequest(reqId);
		
	}

	@Override
	public boolean addEmployeeExpense(int empId, int reqId,TravelExpense travelExpense) {
		
		return employeeDao.addEmployeeExpense(empId,reqId,travelExpense);
	}

	@Override
	public boolean updateEmployeeExpense(int travelExpenseId, TravelExpense travelExpense) {
		return employeeDao.updateEmployeeExpense(travelExpenseId,travelExpense); 
		
	}

	@Override
	public boolean deleteEmployeeExpense(int expenseId) {
		
		return employeeDao.deleteEmployeeExpense(expenseId);
	}

	@Override
	public Set<TravelExpense> findAllTravelExpense(int empId, int reqId) {
		
		return employeeDao.findAllTravelRequests(empId,reqId);
	}

	@Override
	public Employee findEmployeeById(int empId) {
		
		return employeeDao.findEmployeeById(empId);
	}

	@Override
	public Employee updateEmployee(int empId, Employee e) {
		
		return employeeDao.updateEmployee(empId, e);
	}

	

	


	
	
}
