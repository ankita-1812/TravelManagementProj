package com.lti.travelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.exceptions.AdminNotFoundException;
import com.lti.travelmanagement.services.AdminService;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@PostMapping(path="/addemp",produces="application/json")
	public Employee AddEmployee(@RequestBody Employee e ) {
		return  adminService.AddEmployee(e);
		
	}
	@DeleteMapping("/deleteemp/{empid}")
	public boolean deleteEmployee(@PathVariable("empid") int empId) {
		return adminService.deleteEmployee(empId);
	}
	
	@GetMapping("/findallemp")
	public List<Employee> findAllEmployees(){
		return adminService.findAllEmployees();
	}
	
	@PutMapping("/updateemp/{empid}")
	public Employee updateEmployee(@PathVariable("empid") int empId,@RequestBody Employee e) {
		
		return adminService.updateEmployee(empId,e);
	}
	
	//updatetravelrequeststatus
	@GetMapping("/updaterequeststatus/{adminid}/{reqid}/{adminstatus}")
	public boolean updateRequestStatus(@PathVariable("adminid")int adminId,@PathVariable("reqid") int reqId,@PathVariable("adminstatus") String adminStatus) {
		try{
		return adminService.updateRequestStatus(adminId,reqId,adminStatus);
		}
		catch(AdminNotFoundException ae) {
			ae.printStackTrace();
			}
		return false;
	}
	
	//updatetravelexpensestatus
	@GetMapping("/updaterequestexpensestatus/{adminid}/{responseid}/{adminstatus}")
	public boolean updateRequestExpenseStatus(@PathVariable("adminid") int adminId,@PathVariable("responseid") int responseId,@PathVariable("adminstatus") String adminStatus) {
		return adminService.updateRequestExpenseStatus(adminId,responseId,adminStatus);
	}
	
}
