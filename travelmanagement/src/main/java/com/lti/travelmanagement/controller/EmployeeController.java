package com.lti.travelmanagement.controller;


import java.util.List;
import java.util.Set;

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
import com.lti.travelmanagement.beans.TravelExpense;
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
	
//	@PostMapping("/addemp")
//	public Employee addEmployee(@RequestBody Employee e) {
//		return empservice.addEmployee(e);
//	}
	@PostMapping("/addemprequest/{empid}")
	public Employee addEmployeeRequest(@PathVariable("empid") int empId,@RequestBody TravelRequest t) {
		return empservice.addEmployeeRequest(empId,t);
	}
	
	@PutMapping("/updateemprequest/{reqid}")
	public Employee updateEmployeeRequest(@PathVariable("reqid") int reqId,@RequestBody TravelRequest t) {
		return empservice.updateEmployeeRequest(reqId,t);
	}
	
	@GetMapping("/getalltravelrequest/{empid}")
	public Set<TravelRequest> findAllTravelRequests(@PathVariable("empid")int empId){
		return empservice.findAllTravelRequests(empId);
	}
	@DeleteMapping("deleteemprequest/{reqid}")
	public boolean DeleteRequest(@PathVariable("reqid") int reqId) {
		return empservice.deleteTravelRequest(reqId);
	}
	
	@PostMapping("/addempexpense/{empid}/{reqid}")
	public boolean addEmployeeExpense(@PathVariable("empid")int empId,@PathVariable("reqid") int reqId,@RequestBody TravelExpense travelExpense) {
		return empservice.addEmployeeExpense(empId,reqId,travelExpense);
	}
	
	@PutMapping("/updateempexpense/{expenseid}")
	public boolean updatEmployeeExpense(@PathVariable("expenseid") int travelExpenseId,@RequestBody TravelExpense travelExpense) {
		return empservice.updateEmployeeExpense(travelExpenseId,travelExpense);

	}
	
	
}
