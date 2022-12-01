package com.lti.travelmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.dao.TravelRequestDao;
import com.lti.travelmanagement.exceptions.RequestNotFoundException;

@Service("travelRequestService")
public class TravelRequestServiceImpl implements TravelRequestService {

	@Autowired
	TravelRequestDao travelRequestDao;
	@Override
	public List<TravelRequest> findByStatus(String status) {
		
		return travelRequestDao.findByStatus(status);
	}

	@Override
	public List<TravelRequest> findByDate(String date) {
	
		return travelRequestDao.findByDate(date);
	}

	@Override
	public TravelRequest getReqById(int reqId) throws RequestNotFoundException {
		
		return travelRequestDao.getReqById(reqId);
	}

	@Override
	public List<TravelRequest> findAllRes() {
	
		return travelRequestDao.findAllRes();
	}

}
