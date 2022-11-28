package com.lti.travelmanagement.services;

import java.util.List;

import com.lti.travelmanagement.beans.TravelExpense;

public interface TravelExpenseService {

	List<TravelExpense> findByStatus(String status);

	List<TravelExpense> findByDate(String date);

}
