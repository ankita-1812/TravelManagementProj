package com.lti.travelmanagement.controller;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.services.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	
	@GetMapping(path="/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee e) {
		return empservice.addEmployee(e);
	}
	@PostMapping("/addemprequest/{empid}")
	public Employee addEmployeeRequest(@PathVariable("empid") int empid,@RequestBody TravelRequest t) {
		return empservice.addEmployeeRequest(empid,t);
	}
	
	@PutMapping("/updateemprequest/{reqid}")
	public Employee updateEmployeeRequest(@PathVariable("reqid") int reqid,@RequestBody TravelRequest t) {
		return empservice.updateEmployeeRequest(reqid,t);
	}
	
	@GetMapping("/findtravelrequests/{empid}")
	public Set<TravelRequest> findAllTravelRequests(@PathVariable("empid")int empid){
		return empservice.findAllTravelRequests(empid);
	}
	
	
}
