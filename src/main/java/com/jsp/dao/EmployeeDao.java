package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employe;

public class EmployeeDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("wraaqi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveEmployee(Employe employee) {
		et.begin();
		em.persist(employee);
		et.commit();
		em.close();
	}
	
	public Employe findEmployeByName(String name) {
		et.begin();
		Query query = em.createQuery("SELECT e FROM Employe e WHERE e.name = :name");
		query.setParameter("name", name);
		List<Employe> Results = query.getResultList();
		return Results.get(0);
		
	}

	public Employe updateEmploye(Employe employe) {
	    et.begin();
	    employe = em.merge(employe);
	    et.commit();
	    em.close();
	    return employe;
	}


}
