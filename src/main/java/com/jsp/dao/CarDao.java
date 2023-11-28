package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Car;

public class CarDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("wraaqi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Car saveCar(Car car) {
		et.begin();
		em.persist(car);
		et.commit();
		em.close();
		return car;
	}
	
	public Car SwitchAvailabilityCar(Car car) {
		et.begin();
		em.merge(car);
		et.commit();
		em.close();
		return car;
	}
	
	public List<Car> getAllCars(){
		Query query = em.createQuery("SELECT c FROM Car c");
		List<Car> listOfCars = query.getResultList();
		return listOfCars;
	}

	public Car getCarById(Long carId) {
		Query query = em.createQuery("SELECT c FROM Car c WHERE c.carId = :carId");
		query.setParameter("carId", carId);
		List<Car> ListOfCars = query.getResultList();
		return (ListOfCars!=null ? ListOfCars.get(0) : null);
	}
}
