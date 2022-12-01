package com.lti.travelmanagement.services;

import java.util.List;

import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.exceptions.RequestNotFoundException;

public interface TravelRequestService {

	List<TravelRequest> findByStatus(String status);

	List<TravelRequest> findByDate(String date);

	TravelRequest getReqById(int reqId) throws RequestNotFoundException;

	List<TravelRequest> findAllRes();

}
