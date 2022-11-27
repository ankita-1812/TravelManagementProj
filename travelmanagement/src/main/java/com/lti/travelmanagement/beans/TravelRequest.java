package com.lti.travelmanagement.beans;

import javax.persistence.*;

@Entity
public class TravelRequest {
	@Id
	private int  travel_request_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
	private String travel_request_date;
	private String travel_request_status;
	private String travel_request_s_date;
	private String travel_request_e_date;
	private String travel_request_reason;
	
	
	
}
