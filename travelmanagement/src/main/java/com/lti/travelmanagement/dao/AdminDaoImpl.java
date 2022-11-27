package com.lti.travelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.Employee;

@Repository("admindao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	@Transactional
	public Employee AddEmployee(Employee e) {
		
		em.persist(e);
		return e;
	}


	@Override
	public boolean deleteEmployee(int adminid, int empid) {
		Employee e=em.find(Employee.class, empid);
		if(e==null)
			return false;
	
		em.remove(e);
		return true;
	}


	@Override
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> tq=(TypedQuery<Employee>) em.createQuery("select e from Employee as e");
		List<Employee> e=tq.getResultList();
	
		return e;
//		return null;
	}

	

}
