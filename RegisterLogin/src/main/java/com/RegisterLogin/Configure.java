package com.RegisterLogin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.RegisterLogin")
public class Configure {
	@Bean
	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		return emf.createEntityManager();	//it returns the object and it is stored in getEntityManager by using anotation @Bean
	}

	@Bean
	public EntityTransaction getEntityTransaction() {
		EntityManager em = getEntityManager();
		return em.getTransaction();
	}
}
