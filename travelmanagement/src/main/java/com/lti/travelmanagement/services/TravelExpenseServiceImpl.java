package com.lti.travelmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.dao.TravelExpenseDao;

@Service("travelExpenseService")
public class TravelExpenseServiceImpl implements TravelExpenseService {
	@Autowired
	TravelExpenseDao travelExpenseDao;
	@Override
	public List<TravelExpense> findByStatus(String status) {
		
		return travelExpenseDao.findByStatus(status);
	}
	@Override
	public List<TravelExpense> findByDate(String date) {
		
		return travelExpenseDao.findByDate(date);
	}
	@Override
	public TravelExpense findExpById(int expId) {
		
		return travelExpenseDao.findExpById(expId);
	}
	@Override
	public List<TravelExpense> findAllReq() {
		
		return travelExpenseDao.findAllReq();
	}
	
}
