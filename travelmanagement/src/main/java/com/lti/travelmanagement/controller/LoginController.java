package com.lti.travelmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.services.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PutMapping("/updatepassword/{username}")
	public boolean updatePassword(@PathVariable("username") String userName,@RequestBody Login login) {
		return loginService.updatePassword(userName,login);
	}

	
}
