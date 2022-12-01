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
import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.beans.TravelRequest;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	public EmployeeDaoImpl() {
		
	}

	@Override
	@Transactional
	public Employee addEmployee(Employee e) {
		String userName=e.getEmpId()+e.getEmpName();
		Login l=new Login(userName,"Pass@123","employee");
		em.persist(l);
		e.setLogin(l);
		em.persist(e);
		return e;
		
	}


	@Transactional
	public Employee addEmployeeRequest(int empId, TravelRequest t) {
		Employee e=em.find(Employee.class, empId);
		TravelRequest newtr=new TravelRequest();
		newtr.setTravelRequestDate(t.getTravelRequestDate());
		newtr.setTravelRequestStatus("pending");
		newtr.setTravelRequestStartDate(t.getTravelRequestStartDate());
		newtr.setTravelRequestEndDate(t.getTravelRequestEndDate());;
		newtr.setTravelRequestReason(t.getTravelRequestReason());;
		newtr.setDestinationFrom(t.getDestinationFrom());
		newtr.setDestinationTo(t.getDestinationTo());
		newtr.setEstimatedExpense(t.getEstimatedExpense());
		newtr.setModeOfTravel(t.getModeOfTravel());
		newtr.setEmployee(e);
		
		em.persist(newtr);
	
		
		
		return e;
	}

	@Transactional
	public Employee updateEmployeeRequest(int reqId, TravelRequest t) {
		
		TravelRequest e=em.find(TravelRequest.class, reqId);
		e.setTravelRequestDate(t.getTravelRequestDate());
		
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

	@Transactional
	public boolean addEmployeeExpense(int empId, int reqId,TravelExpense travelExpense) {
		Employee e=em.find(Employee.class, empId);
	
		TravelRequest t=em.find(TravelRequest.class, reqId);
		
		if(e==null || t==null)
			return false;
		TravelExpense travelExpenseNew=new TravelExpense();
		travelExpenseNew.setTravelExpenseDate(travelExpense.getTravelExpenseDate());
		travelExpenseNew.setTravelExpenseStatus("pending");
		travelExpenseNew.setTravelDetails(travelExpense.getTravelDetails());
		travelExpenseNew.setTravelCostExpense(travelExpense.getTravelCostExpense());
		travelExpenseNew.setEmployee(e);
		travelExpenseNew.setTravelRequest(t);
		
		em.persist(travelExpenseNew);
		return true;
	}

	@Transactional
	public boolean updateEmployeeExpense(int travelExpenseId, TravelExpense travelExpense) {
		TravelExpense travelExpenseUpdate=em.find(TravelExpense.class, travelExpenseId);
		if(travelExpenseUpdate==null)
			return false;
		travelExpenseUpdate.setTravelExpenseDate(travelExpense.getTravelExpenseDate());
		
		travelExpenseUpdate.setTravelDetails(travelExpense.getTravelDetails());
		travelExpenseUpdate.setTravelCostExpense(travelExpense.getTravelCostExpense());
		em.merge(travelExpenseUpdate);
		
		return true;
	}

	@Transactional
	public boolean deleteEmployeeExpense(int expenseId) {
		
//		TravelExpense travelRequest=em.find(TravelExpense.class, expenseId);
		Query q=em.createQuery("delete from TravelExpense  te where te.travelExpenseId=:expenseId");
		q.setParameter("expenseId", expenseId);
		int rowsDeleted=q.executeUpdate();
//		
		if(rowsDeleted==0)
		return false;
		
		return true;
	}

	public Set<TravelExpense> findAllTravelRequests(int empId, int reqId) {
		Query q= em.createQuery("select te from TravelExpense as te where te.employee.empId=:empId and te.travelRequest.travelRequestId=:reqId");
		q.setParameter("empId", empId);
		q.setParameter("reqId", reqId);
		
		List<TravelExpense> trList= (List<TravelExpense>) q.getResultList();
		Set<TravelExpense> trset = new HashSet<TravelExpense>(trList);  	
		return trset;
		
	}

	public Employee findEmployeeById(int empId) {
		Employee e=em.find(Employee.class,empId);
		return e;
	}

	@Transactional
	public Employee updateEmployee(int empId, Employee e) {
		Employee empUpdate=em.find(Employee.class, empId);
		empUpdate.setEmpName(e.getEmpName());
		empUpdate.setEmpAddr(e.getEmpAddr());
		empUpdate.setEmpDept(e.getEmpDept());
		empUpdate.setEmpContactNo(e.getEmpContactNo());
		empUpdate.setEmpMail(e.getEmpMail());
		em.merge(empUpdate);
		
		return empUpdate;
	}

	}
