package com.lti.travelmanagement.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.travelmanagement.beans.Admin;
import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.Login;
import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.exceptions.InvalidUserException;

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
	@Override
	public Employee checkEmployeeExist(String userName, String password, String userType) throws InvalidUserException {
		Query q= em.createQuery("select e from Employee as e where e.login.userName=:userName and e.login.password=:password and e.login.userType=:userType");
		q.setParameter("userName", userName);
		q.setParameter("password", password);
		q.setParameter("userType",userType);
		
		
		Employee e =(Employee) q.getSingleResult();
		
		if(e==null) {
			throw new InvalidUserException();
		}
		return e;
	}
	@Override
	public Admin checkAdminExist(String userName, String password, String userType)throws InvalidUserException  {
		Query q= em.createQuery("select a from Admin as a where a.login.userName=:userName and a.login.password=:password and a.login.userType=:userType");
		q.setParameter("userName", userName);
		q.setParameter("password", password);
		q.setParameter("userType",userType);
		
		Admin a =(Admin) q.getSingleResult();
		if(a==null)
		{
			throw new InvalidUserException();
		}
		return a;
		
	}

}
