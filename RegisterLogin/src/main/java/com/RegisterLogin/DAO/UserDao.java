package com.RegisterLogin.DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.RegisterLogin.DTO.UserRegistration;

@Repository
public class UserDao {
	@Autowired
	EntityManager em;
	
	@Autowired
	EntityTransaction et;
	
	//to store users data
	public void saveUser(UserRegistration register) {
		et.begin();
		em.persist(register);
		et.commit();
	}
	
	//to validate the users data
	public String validateUser(UserRegistration user) {
		String e_mail = user.getE_mail();
		String password = user.getPassword();
		
		Query query = em.createQuery("select u from UserRegistration u where u.e_mail=?1 and u.password=?2");
		
		query.setParameter(1, e_mail);
		query.setParameter(2, password);
		
		UserRegistration u = (UserRegistration) query.getSingleResult();
		
		if(u!= null) {
			return "login successfull";
		}
		else {
			return "invalid user or password ";
		}
		
		
		
	}
}
