package com.lti.travelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.services.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	@PostMapping("/addemp")
	public Employee AddEmployee(@RequestBody Employee e ) {
		return  adminservice.AddEmployee(e);
		
	}
	@DeleteMapping("/deleteemp/{empid}")
	public boolean deleteEmployee(@PathVariable("empid") int empId) {
		return adminservice.deleteEmployee(empId);
	}
	
	@GetMapping("/findallemp")
	public List<Employee> findAllEmployees(){
		return adminservice.findAllEmployees();
	}
	
	@PutMapping("/updateemp/{empid}")
	public Employee updateEmployee(@PathVariable("empid") int empId,@RequestBody Employee e) {
		
		return adminservice.updateEmployee(empId,e);
	}
	
	
	
}
