package com.lti.travelmanagement.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Employees_travel")
public class Employee {

	@Id
	private int emp_id;
	private String emp_name;
	private String emp_mail;
	private String emp_addr;
	private String emp_dept;
	@JsonIgnore
	@OneToMany(mappedBy = "employee" ,cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<TravelRequest> travelrequest=new HashSet<TravelRequest>();
	
	public Set<TravelRequest> getTravelrequest() {
		return travelrequest;
	}
	public void setTravelrequest(TravelRequest t) {
		this.travelrequest.add(t);
	}
	public Employee() {
		
	}
	public Employee(int emp_id, String emp_name, String emp_mail, String emp_addr, String emp_dept,
			Set<TravelRequest> travelrequest) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_mail = emp_mail;
		this.emp_addr = emp_addr;
		this.emp_dept = emp_dept;
		this.travelrequest = travelrequest;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_mail() {
		return emp_mail;
	}
	public void setEmp_mail(String emp_mail) {
		this.emp_mail = emp_mail;
	}
	public String getEmp_addr() {
		return emp_addr;
	}
	public void setEmp_addr(String emp_addr) {
		this.emp_addr = emp_addr;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_mail=" + emp_mail + ", emp_addr="
				+ emp_addr + ", emp_dept=" + emp_dept + ", travelrequest=" + travelrequest + "]";
	}

	
	
	
}
