package com.lti.travelmanagement.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="travel_expense")
public class TravelExpense {

	
	@Id
	private int travel_expense_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tr_fk")
	private TravelRequest travelrequest;
	private String travel_expense_date;
	private String travel_expense_status;
	public TravelExpense(int travel_expense_id, TravelRequest travelrequest, String travel_expense_date,
			String travel_expense_status) {
		super();
		this.travel_expense_id = travel_expense_id;
		this.travelrequest = travelrequest;
		this.travel_expense_date = travel_expense_date;
		this.travel_expense_status = travel_expense_status;
	}
	public int getTravel_expense_id() {
		return travel_expense_id;
	}
	public void setTravel_expense_id(int travel_expense_id) {
		this.travel_expense_id = travel_expense_id;
	}
	public TravelRequest getTravelrequest() {
		return travelrequest;
	}
	public void setTravelrequest(TravelRequest travelrequest) {
		this.travelrequest = travelrequest;
	}
	public String getTravel_expense_date() {
		return travel_expense_date;
	}
	public void setTravel_expense_date(String travel_expense_date) {
		this.travel_expense_date = travel_expense_date;
	}
	public String getTravel_expense_status() {
		return travel_expense_status;
	}
	public void setTravel_expense_status(String travel_expense_status) {
		this.travel_expense_status = travel_expense_status;
	}
	@Override
	public String toString() {
		return "TravelExpense [travel_expense_id=" + travel_expense_id + ", travelrequest=" + travelrequest
				+ ", travel_expense_date=" + travel_expense_date + ", travel_expense_status=" + travel_expense_status
				+ "]";
	}
	
	
	

}
