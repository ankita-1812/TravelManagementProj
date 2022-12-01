package com.lti.travelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.exceptions.RequestNotFoundException;
import com.lti.travelmanagement.services.TravelExpenseService;
import com.lti.travelmanagement.services.TravelRequestService;

@CrossOrigin("*")
@RestController
@RequestMapping("/travelrequest")
public class TravelRequestController {
 
	
	@Autowired
	TravelRequestService travelRequestService;
	
	@GetMapping("/findbystatus/{status}")
	public List<TravelRequest> findByStatus(@PathVariable("status")String status){
		return travelRequestService.findByStatus(status);
		
	}
	
		//searchbydate
	@GetMapping("/findbydate/{date}")
	public List<TravelRequest> findByDate(@PathVariable("date") String date){
		return travelRequestService.findByDate(date);
	}
	
	@GetMapping("/getreqbyid/{reqid}")
	public TravelRequest getReqById(@PathVariable("reqid") int reqId) {
		try {
		return travelRequestService.getReqById(reqId);
		}
		catch(RequestNotFoundException requestNotFound) {
			requestNotFound.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("findallreq")
	public List<TravelRequest> findAllRes(){
		return travelRequestService.findAllRes();
	}
	
}
