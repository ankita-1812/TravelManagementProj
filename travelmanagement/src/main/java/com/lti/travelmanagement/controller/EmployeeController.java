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

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@GetMapping(path="/hello")
	public String hello() {
		return "hello";
	}
	
//	@PostMapping("/addemp")
//	public Employee addEmployee(@RequestBody Employee e) {
//		return empservice.addEmployee(e);
//	}
	@GetMapping("findempbyid/{empid}")
	public Employee findEmployeeById(@PathVariable("empid" )int empId) {
		return  empService.findEmployeeById(empId);
	}
	@PostMapping("/addemprequest/{empid}")
	public Employee addEmployeeRequest(@PathVariable("empid") int empId,@RequestBody TravelRequest t) {
		return empService.addEmployeeRequest(empId,t);
	}
	
	@PutMapping("/updateemprequest/{reqid}")
	public Employee updateEmployeeRequest(@PathVariable("reqid") int reqId,@RequestBody TravelRequest t) {
		return empService.updateEmployeeRequest(reqId,t);
	}
	
	@GetMapping("/getalltravelrequest/{empid}")
	public Set<TravelRequest> findAllTravelRequests(@PathVariable("empid")int empId){
		return empService.findAllTravelRequests(empId);
	}
	

	
	@DeleteMapping("deleteemprequest/{reqid}")
	public boolean DeleteRequest(@PathVariable("reqid") int reqId) {
		return empService.deleteTravelRequest(reqId);
	}
	
	@PostMapping("/addempexpense/{empid}/{reqid}")
	public boolean addEmployeeExpense(@PathVariable("empid")int empId,@PathVariable("reqid") int reqId,@RequestBody TravelExpense travelExpense) {
		return empService.addEmployeeExpense(empId,reqId,travelExpense);
	}
	
	@PutMapping("/updateempexpense/{expenseid}")
	public boolean updatEmployeeExpense(@PathVariable("expenseid") int travelExpenseId,@RequestBody TravelExpense travelExpense) {
		return empService.updateEmployeeExpense(travelExpenseId,travelExpense);

	}
	
	@DeleteMapping("/deleteempexpense/{expenseid}")
	public boolean deleteEmployeeExpense(@PathVariable("expenseid") int expenseId) {
		return empService.deleteEmployeeExpense(expenseId);
	}
	
	
	@GetMapping("/getalltravelexpense/{empid}/{reqid}")
	public Set<TravelExpense> findAllTravelExpense(@PathVariable("empid") int empId,@PathVariable("reqid") int reqId){
		return empService.findAllTravelExpense(empId,reqId);
	}
	
}
	