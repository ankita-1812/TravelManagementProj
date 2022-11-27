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



	public Employee addEmployeeRequest(int empid, TravelRequest t) {
		
		Employee e=em.find(Employee.class, empid);
		
		e.setTravelrequest(t);
		
		return e;
	}
}
