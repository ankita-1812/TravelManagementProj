package com.lti.travelmanagement.dao;

import java.util.List;

import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.exceptions.RequestNotFoundException;

public interface TravelRequestDao {

	List<TravelRequest> findByStatus(String status);

	List<TravelRequest> findByDate(String date);

	TravelRequest getReqById(int reqId) throws RequestNotFoundException;

	List<TravelRequest> findAllRes();

}
