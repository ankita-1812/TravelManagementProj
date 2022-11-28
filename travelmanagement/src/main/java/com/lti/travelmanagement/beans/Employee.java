package com.lti.travelmanagement.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	@Column(name = "EmployeeId", length = 10)
	private int empId;

	@Column(name = "EmployeeName", length = 30)
	private String empName;

	@Column(name = "EmployeeEmail", length = 30)
	private String empMail;

	@Column(name = "EmployeeAdd", length = 50)
	private String empAddr;

	@Column(name = "EmployeeDept", length = 40)
	private String empDept;

	@Column(name = "EmployeeContact", length = 10)
	private String empContactNo;

	@OneToOne(cascade = CascadeType.ALL)
	private Login login;

	public Employee() {

	}

	public Employee(int empId, String empName, String empMail, String empAddr, String empDept, String empContactNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empAddr = empAddr;
		this.empDept = empDept;
		this.empContactNo = empContactNo;
	}

	public Employee(int empId, String empName, String empMail, String empAddr, String empDept, String empContactNo,
			Login login) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empAddr = empAddr;
		this.empDept = empDept;
		this.empContactNo = empContactNo;
		this.login = login;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empAddr=" + empAddr
				+ ", empDept=" + empDept + ", empContactNo=" + empContactNo + "]";
	}

}
