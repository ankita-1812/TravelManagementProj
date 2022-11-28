package com.lti.travelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.Admin;
import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.beans.TravelRequest;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	@Transactional
	public Employee AddEmployee(Employee e) {
		String userName=e.getEmpId()+"_"+e.getEmpName();
		Login l=new Login(userName,"Pass@123","employee");
		em.persist(l);
		e.setLogin(l);
		em.persist(e);
		return e;
	}


	@Override
	public boolean deleteEmployee( int empid) {
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


	@Override
	@Transactional
	public Employee updateEmployee(int empId,Employee e) {
		Employee updateEmp=em.find(Employee.class, empId);
		updateEmp.setEmpName(e.getEmpName());
		updateEmp.setEmpAddr(e.getEmpAddr());
		updateEmp.setEmpMail(e.getEmpMail());
		updateEmp.setEmpContactNo(e.getEmpContactNo());
		updateEmp.setEmpDept(e.getEmpDept());

		e=em.merge(updateEmp);
		return e;
	}


	@Override
	@Transactional
	public boolean updateRequestStatus(int adminId, int reqId, String adminStatus) {
		TravelRequest t=em.find(TravelRequest.class, reqId);
		Admin admin=em.find(Admin.class, adminId);
		if(admin==null || t==null)
			return false;

		t.setAdmin(admin);
		t.setTravelRequestStatus(adminStatus);
		em.merge(t);
		return true;
	}


	@Override
	@Transactional
	public boolean updateRequestExpenseStatus(int adminId, int responseId, String adminStatus) {
		TravelExpense travelExpense=em.find(TravelExpense.class, responseId);
		Admin admin=em.find(Admin.class, adminId);
		if(admin==null || travelExpense==null)
		return false;
		travelExpense.setAdmin(admin);
		travelExpense.setTravelExpenseStatus(adminStatus);
		em.merge(travelExpense);
		return true;
	}

	

}
