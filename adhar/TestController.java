package com.jsp.person.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mac");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("sanyukta");
		person.setEmail("sanyukta@gmail.com");
		
		Aadhar aadhar=new Aadhar();
		aadhar.setAadhar_no("05");
		aadhar.setCity("panvel");
		aadhar.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityManager.persist(person);
		entityTransaction.commit();
	}
}
