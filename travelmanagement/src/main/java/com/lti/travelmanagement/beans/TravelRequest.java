package com.lti.travelmanagement.beans;

import javax.persistence.*;

@Entity
@Table(name = "TRAVELREQUESTS")
public class TravelRequest {
	@Id
	@Column(name = "TravelRequestId", length = 10)
	private int travelRequestId;

	@Column(name = "TravelRequestDate", length = 10)
	private String travelRequestDate;

	@Column(name = "TravelRequestStatus", length = 20)
	private String travelRequestStatus;

	@Column(name = "TravelRequestSD", length = 10)
	private String travelRequestStartDate;

	@Column(name = "TravelRequestED", length = 10)
	private String travelRequestEndDate;

	@Column(name = "TravelRequestReason", length = 50)
	private String travelRequestReason;

	@Column(name = "DestinationFrom", length = 20)
	private String destinationFrom;

	@Column(name = "DestinationTo", length = 20)
	private String destinationTo;

	@Column(name = "TravelEstimatedExpense", length = 10)
	private double estimatedExpense;

	@Column(name = "ModeOfTravel", length = 20)
	private String modeOfTravel;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adminId")
	private Admin admin;
	

	public TravelRequest() {

	}

	

	public TravelRequest(int travelRequestId, String travelRequestDate, String travelRequestStatus,
			String travelRequestStartDate, String travelRequestEndDate, String travelRequestReason,
			String destinationFrom, String destinationTo, double estimatedExpense, String modeOfTravel,
			Employee employee) {
		super();
		this.travelRequestId = travelRequestId;
		this.travelRequestDate = travelRequestDate;
		this.travelRequestStatus = travelRequestStatus;
		this.travelRequestStartDate = travelRequestStartDate;
		this.travelRequestEndDate = travelRequestEndDate;
		this.travelRequestReason = travelRequestReason;
		this.destinationFrom = destinationFrom;
		this.destinationTo = destinationTo;
		this.estimatedExpense = estimatedExpense;
		this.modeOfTravel = modeOfTravel;
		this.employee = employee;
	}
	

	public int getTravelRequestId() {
		return travelRequestId;
	}

	public void setTravelRequestId(int travelRequestId) {
		this.travelRequestId = travelRequestId;
	}

	public String getTravelRequestDate() {
		return travelRequestDate;
	}

	public void setTravelRequestDate(String travelRequestDate) {
		this.travelRequestDate = travelRequestDate;
	}

	public String getTravelRequestStatus() {
		return travelRequestStatus;
	}

	public void setTravelRequestStatus(String travelRequestStatus) {
		this.travelRequestStatus = travelRequestStatus;
	}

	public String getTravelRequestStartDate() {
		return travelRequestStartDate;
	}

	public void setTravelRequestStartDate(String travelRequestStartDate) {
		this.travelRequestStartDate = travelRequestStartDate;
	}

	public String getTravelRequestEndDate() {
		return travelRequestEndDate;
	}

	public void setTravelRequestEndDate(String travelRequestEndDate) {
		this.travelRequestEndDate = travelRequestEndDate;
	}

	public String getTravelRequestReason() {
		return travelRequestReason;
	}

	public void setTravelRequestReason(String travelRequestReason) {
		this.travelRequestReason = travelRequestReason;
	}

	public String getDestinationFrom() {
		return destinationFrom;
	}

	public void setDestinationFrom(String destinationFrom) {
		this.destinationFrom = destinationFrom;
	}

	public String getDestinationTo() {
		return destinationTo;
	}

	public void setDestinationTo(String destinationTo) {
		this.destinationTo = destinationTo;
	}

	public double getEstimatedExpense() {
		return estimatedExpense;
	}

	public void setEstimatedExpense(double estimatedExpense) {
		this.estimatedExpense = estimatedExpense;
	}

	public String getModeOfTravel() {
		return modeOfTravel;
	}

	public void setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "TravelRequest [travelRequestId=" + travelRequestId + ", travelRequestDate=" + travelRequestDate
				+ ", travelRequestStatus=" + travelRequestStatus + ", travelRequestStartDate=" + travelRequestStartDate
				+ ", travelRequestEndDate=" + travelRequestEndDate + ", travelRequestReason=" + travelRequestReason
				+ ", destinationFrom=" + destinationFrom + ", destinationTo=" + destinationTo + ", estimatedExpense="
				+ estimatedExpense + ", modeOfTravel=" + modeOfTravel + ", employee=" + employee + "]";
	}

}
