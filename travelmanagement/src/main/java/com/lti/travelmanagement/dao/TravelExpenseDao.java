package com.lti.travelmanagement.dao;

import java.util.List;

import com.lti.travelmanagement.beans.TravelExpense;

public interface TravelExpenseDao {

	List<TravelExpense> findByStatus(String status);

	List<TravelExpense> findByDate(String date);

}
