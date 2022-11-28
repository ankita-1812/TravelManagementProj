package com.lti.travelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.TravelExpense;
import com.lti.travelmanagement.services.TravelExpenseService;

@RestController
@RequestMapping("/travelexpense")
public class TravelExpenseController {
		//searchbystatus
	@Autowired
	TravelExpenseService travelExpenseService;
	
	@GetMapping("/findbystatus/{status}")
	public List<TravelExpense> findByStatus(@PathVariable("status")String status){
		return travelExpenseService.findByStatus(status);
		
	}
	
		//searchbydate
	@GetMapping("/findbydate/{date}")
	public List<TravelExpense> findByDate(@PathVariable("date") String date){
		return travelExpenseService.findByDate(date);
	}
	
}
