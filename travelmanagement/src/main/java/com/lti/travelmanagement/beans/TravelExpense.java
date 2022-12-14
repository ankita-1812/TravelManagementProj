package com.lti.travelmanagement.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TRAVELEXPENSECLAIMS")
public class TravelExpense {

	@Id
	@SequenceGenerator(name = "seq_res_gen", sequenceName = "seq_res", allocationSize = 1)
	@GeneratedValue(generator = "seq_res")
	private int travelExpenseId;
	private String travelExpenseDate;
	private String travelExpenseStatus;
	private String travelDetails;
	private Double travelCostExpense;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TravelRequestId")
	private TravelRequest travelRequest;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private Employee employee;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adminId")
	private Admin admin;

	public TravelExpense() {

	}

	public TravelExpense(int travelExpenseId, String travelExpenseDate, String travelExpenseStatus) {
		super();
		this.travelExpenseId = travelExpenseId;
		this.travelExpenseDate = travelExpenseDate;
		this.travelExpenseStatus = travelExpenseStatus;
	}

	public TravelExpense(int travelExpenseId, String travelExpenseDate, String travelExpenseStatus,
			TravelRequest travelRequest, Employee employee, Admin admin) {
		super();
		this.travelExpenseId = travelExpenseId;
		this.travelExpenseDate = travelExpenseDate;
		this.travelExpenseStatus = travelExpenseStatus;
		this.travelRequest = travelRequest;
		this.employee = employee;
		this.admin = admin;
	}

	public int getTravelExpenseId() {
		return travelExpenseId;
	}

	public void setTravelExpenseId(int travelExpenseId) {
		this.travelExpenseId = travelExpenseId;
	}

	public String getTravelExpenseDate() {
		return travelExpenseDate;
	}

	public void setTravelExpenseDate(String travelExpenseDate) {
		this.travelExpenseDate = travelExpenseDate;
	}

	public String getTravelExpenseStatus() {
		return travelExpenseStatus;
	}

	public void setTravelExpenseStatus(String travelExpenseStatus) {
		this.travelExpenseStatus = travelExpenseStatus;
	}

	public TravelRequest getTravelRequest() {
		return travelRequest;
	}

	public void setTravelRequest(TravelRequest travelRequest) {
		this.travelRequest = travelRequest;
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
	

	public String getTravelDetails() {
		return travelDetails;
	}

	public void setTravelDetails(String travelDetails) {
		this.travelDetails = travelDetails;
	}

	public Double getTravelCostExpense() {
		return travelCostExpense;
	}

	public void setTravelCostExpense(Double travelCostExpense) {
		this.travelCostExpense = travelCostExpense;
	}

	@Override
	public String toString() {
		return "TravelExpense [travelExpenseId=" + travelExpenseId + ", travelExpenseDate=" + travelExpenseDate
				+ ", travelDetails=" + travelDetails + ", travelCostExpense=" + travelCostExpense
				+ ", travelExpenseStatus=" + travelExpenseStatus + ", travelRequest=" + travelRequest + ", employee="
				+ employee + ", admin=" + admin + "]";
	}

	

}
