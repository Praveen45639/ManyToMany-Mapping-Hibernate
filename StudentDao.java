package com.demo.hiber.dao;



import com.demo.hiber.dto.Student;
import com.hibernate.demo.dao.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {
	
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	//EntityManager em = JPAUtil.getFactory().createEntityManager();
	EntityManager em=JPAUtil.getFactory().createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void saveStudent(Student student) {
		et.begin();
		em.persist(student);
		et.commit();
		System.out.println(student.getName()+" is saved successfully");
	}

}
