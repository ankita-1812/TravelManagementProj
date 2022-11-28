package com.lti.travelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao{

	@PersistenceContext
	EntityManager em;
	@Override
	@Transactional
	public boolean updatePassword(String userName, Login login) {
		Login loginUpdate=em.find(Login.class, userName);
		if(loginUpdate==null)
			return false;
		loginUpdate.setPassword(login.getPassword());
		em.merge(loginUpdate);
		return true;
	}

}
