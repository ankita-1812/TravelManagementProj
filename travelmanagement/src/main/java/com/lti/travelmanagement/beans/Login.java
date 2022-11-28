package com.lti.travelmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class Login {
	@Id
	@Column(name = "UserName", length = 50)
	private String userName;

	@Column(name = "UserPassword", length = 10)
	private String password;

	@Column(name = "UserType", length = 20)
	private String userType;

	public Login() {

	}

	public Login(String userName, String password, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}

}
