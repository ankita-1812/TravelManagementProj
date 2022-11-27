package com.lti.travelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelRequest;

@Repository("employeedao")
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	public EmployeeDaoImpl() {
		
	}

	@Override
	@Transactional
	public Employee addEmployee(Employee e) {
		
		em.persist(e);
		return e;
	}


	@Transactional
	public Employee addEmployeeRequest(int empid, TravelRequest t) {
		
		Employee e=em.find(Employee.class, empid);
		
		e.setTravelrequest(t);
		t.setEmployee(e);
		return e;
	}

	@Transactional
	public Employee updateEmployeeRequest(int reqid, TravelRequest t) {
		
		TravelRequest e=em.find(TravelRequest.class, reqid);
		e.setTravel_request_date(t.getTravel_request_date());
		e.setTravel_request_status(t.getTravel_request_status());
		e.setTravel_request_s_date(t.getTravel_request_s_date());
		e.setTravel_request_e_date(t.getTravel_request_e_date());
		e.setTravel_request_reason(t.getTravel_request_reason());
		em.merge(e);
		Employee emp=em.find(Employee.class, e.getEmployee().getEmp_id());
		return emp;
		
	}
}
