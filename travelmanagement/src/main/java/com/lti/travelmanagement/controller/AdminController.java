package com.lti.travelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping("/addemp/{adminid}")
	public Employee AddEmployee(@RequestBody Employee e ) {
		return  adminservice.AddEmployee(e);
		
	}
	@DeleteMapping("/deleteemp/{adminid}/{empid}")
	public boolean deleteEmployee(@PathVariable("adminid") int adminid,@PathVariable("empid") int empid) {
		return adminservice.deleteEmployee(adminid,empid);
	}
	
	@GetMapping("/findallemp")
	public List<Employee> findAllEmployees(){
		return adminservice.findAllEmployees();
	}
	
}
