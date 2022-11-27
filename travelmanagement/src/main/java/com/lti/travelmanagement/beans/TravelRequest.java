package com.lti.travelmanagement.beans;

import javax.persistence.*;

@Entity
public class TravelRequest {
	@Id
	private int  travel_request_id;
	private String travel_request_date;
	private String travel_request_status;
	private String travel_request_s_date;
	private String travel_request_e_date;
	private String travel_request_reason;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empid_fk")
	private Employee employee;
	public TravelRequest() {
		
	}
	public TravelRequest(int travel_request_id,  String travel_request_date,
			String travel_request_status, String travel_request_s_date, String travel_request_e_date,
			String travel_request_reason) {
		super();
		this.travel_request_id = travel_request_id;
		this.travel_request_date = travel_request_date;
		this.travel_request_status = travel_request_status;
		this.travel_request_s_date = travel_request_s_date;
		this.travel_request_e_date = travel_request_e_date;
		this.travel_request_reason = travel_request_reason;
	}
	public int getTravel_request_id() {
		return travel_request_id;
	}
	public void setTravel_request_id(int travel_request_id) {
		this.travel_request_id = travel_request_id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getTravel_request_date() {
		return travel_request_date;
	}
	public void setTravel_request_date(String travel_request_date) {
		this.travel_request_date = travel_request_date;
	}
	public String getTravel_request_status() {
		return travel_request_status;
	}
	public void setTravel_request_status(String travel_request_status) {
		this.travel_request_status = travel_request_status;
	}
	public String getTravel_request_s_date() {
		return travel_request_s_date;
	}
	public void setTravel_request_s_date(String travel_request_s_date) {
		this.travel_request_s_date = travel_request_s_date;
	}
	public String getTravel_request_e_date() {
		return travel_request_e_date;
	}
	public void setTravel_request_e_date(String travel_request_e_date) {
		this.travel_request_e_date = travel_request_e_date;
	}
	public String getTravel_request_reason() {
		return travel_request_reason;
	}
	public void setTravel_request_reason(String travel_request_reason) {
		this.travel_request_reason = travel_request_reason;
	}
	
	
	
	
	
}
