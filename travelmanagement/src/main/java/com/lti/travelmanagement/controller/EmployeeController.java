package com.lti.travelmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.services.EmployeeService;

@CrossOrigin("*")
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
}
