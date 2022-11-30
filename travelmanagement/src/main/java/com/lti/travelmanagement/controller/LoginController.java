package com.lti.travelmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.services.LoginService;
@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PutMapping("/updatepassword/{username}")
	public boolean updatePassword(@PathVariable("username") String userName,@RequestBody Login login) {
		return loginService.updatePassword(userName,login);
	}

	@GetMapping("checkidentity/employee/{username}/{password}/{userType}")
	public Employee checkEmployeeExist(@PathVariable("username") String userName,@PathVariable("password") String password,@PathVariable("userType") String userType) {
		return loginService.checkEmployeeExist(userName,password,userType);
		
	}
}
