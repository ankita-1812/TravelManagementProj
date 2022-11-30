package com.lti.travelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.beans.TravelRequest;

@Repository("travelRequestDao")
public class TravelRequestDaoImpl implements TravelRequestDao{

	@PersistenceContext
	EntityManager em;
	@Override
	public List<TravelRequest> findByStatus(String status) {
		Query q= em.createQuery("select te from TravelRequest as te where te.travelRequestStatus=:status");
		q.setParameter("status", status);
	
		
		List<TravelRequest> trList= (List<TravelRequest>) q.getResultList();
		 	
		return trList;
		
	}

	@Override
	public List<TravelRequest> findByDate(String date) {
		Query q= em.createQuery("select te from TravelRequest as te where te.travelRequestDate=:date");
		q.setParameter("date", date);
		List<TravelRequest> trList= (List<TravelRequest>) q.getResultList();
		 	
		return trList;
	}

}
