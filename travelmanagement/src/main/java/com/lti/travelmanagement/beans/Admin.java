package com.lti.travelmanagement.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class Admin {

	@Id
	@Column(name = "AdminId", length = 10)
	private int adminId;

	@Column(name = "AdminName", length = 30)
	private String adminName;

	@Column(name = "AdminMail", length = 40)
	private String adminMail;

	@Column(name = "AdminAddr", length = 50)
	private String adminAddr;

	@Column(name = "AdminContact", length = 10)
	private String adminContactNo;

	@OneToOne(cascade = CascadeType.ALL)
	private Login login;

	public Admin() {

	}

	public Admin(int adminId, String adminName, String adminMail, String adminAddr, String adminContactNo) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminMail = adminMail;
		this.adminAddr = adminAddr;
		this.adminContactNo = adminContactNo;
	}

	public Admin(int adminId, String adminName, String adminMail, String adminAddr, String adminContactNo,
			Login login) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminMail = adminMail;
		this.adminAddr = adminAddr;
		this.adminContactNo = adminContactNo;
		this.login = login;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminMail() {
		return adminMail;
	}

	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}

	public String getAdminAddr() {
		return adminAddr;
	}

	public void setAdminAddr(String adminAddr) {
		this.adminAddr = adminAddr;
	}

	public String getAdminContactNo() {
		return adminContactNo;
	}

	public void setAdminContactNo(String adminContactNo) {
		this.adminContactNo = adminContactNo;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminMail=" + adminMail + ", adminAddr="
				+ adminAddr + ", adminContactNo=" + adminContactNo + ", login=" + login + "]";
	}

}