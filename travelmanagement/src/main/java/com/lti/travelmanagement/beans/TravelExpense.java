package com.lti.travelmanagement.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="travel_expense")
public class TravelExpense {

	@Id
	private int travel_expense_id;
	@OneToOne(cascade = CascadeType.ALL)
	private TravelRequest travelrequest;
	private String travel_expense_date;
	private String travel_expense_status;
	
	

}
