package com.lti.travelmanagement.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
	public Employee addEmployeeRequest(int empId, TravelRequest t) {
		
		em.persist(t);
		Employee e=em.find(Employee.class, empId);
		
		t.setEmployee(e);
		return e;
	}

	@Transactional
	public Employee updateEmployeeRequest(int reqId, TravelRequest t) {
		
		TravelRequest e=em.find(TravelRequest.class, reqId);
		e.setTravelRequestDate(t.getTravelRequestDate());
		e.setTravelRequestStatus(t.getTravelRequestStatus());
		e.setTravelRequestStartDate(t.getTravelRequestStartDate());
		e.setTravelRequestEndDate(t.getTravelRequestEndDate());;
		e.setTravelRequestReason(t.getTravelRequestReason());;
		e.setDestinationFrom(t.getDestinationFrom());
		e.setDestinationTo(t.getDestinationTo());
		e.setEstimatedExpense(t.getEstimatedExpense());
		e.setModeOfTravel(t.getModeOfTravel());
		em.merge(e);
		System.out.println(e);
		Employee emp=em.find(Employee.class, e.getEmployee().getEmpId());
		return emp;
		
	}

	@Override
	public Set<TravelRequest> findAllTravelRequests(int empId) {
		
		Query q= em.createQuery("select tr from TravelRequest as tr where tr.employee.empId=:empId");
		q.setParameter("empId", empId);
		
		List<TravelRequest> trList= (List<TravelRequest>) q.getResultList();
		Set<TravelRequest> trset = new HashSet<TravelRequest>(trList);  	
		return trset;
		
	}

	@Transactional
	public boolean deleteTravelRequest(int reqId) {
		TravelRequest travelRequest=em.find(TravelRequest.class, reqId);
		Query q=em.createQuery("delete from TravelRequest  tr where tr.travelRequestId=:reqId");
		q.setParameter("reqId", reqId);
		int rowsDeleted=q.executeUpdate();
//		
		if(rowsDeleted==0)
		return false;
		
		return true;
	}

	}
