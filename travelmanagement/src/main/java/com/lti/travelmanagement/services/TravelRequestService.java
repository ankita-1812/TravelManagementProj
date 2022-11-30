package com.lti.travelmanagement.services;

import java.util.List;

import com.lti.travelmanagement.beans.TravelRequest;

public interface TravelRequestService {

	List<TravelRequest> findByStatus(String status);

	List<TravelRequest> findByDate(String date);

	TravelRequest getReqById(int reqId);

	List<TravelRequest> findAllRes();

}
