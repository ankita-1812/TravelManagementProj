package com.lti.travelmanagement.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.TravelExpense;

@Repository("travelExpenseDao")
public class TravelExpenseDaoImpl implements TravelExpenseDao{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<TravelExpense> findByStatus(String status) {
		
		Query q= em.createQuery("select te from TravelExpense as te where te.travelExpenseStatus=:status");
		q.setParameter("status", status);
	
		
		List<TravelExpense> trList= (List<TravelExpense>) q.getResultList();
		 	
		return trList;
	}

	@Override
	public List<TravelExpense> findByDate(String date) {
		Query q= em.createQuery("select te from TravelExpense as te where te.travelExpenseDate=:date");
		q.setParameter("date", date);
	
		
		List<TravelExpense> trList= (List<TravelExpense>) q.getResultList();
		 	
		return trList;
	}

}
