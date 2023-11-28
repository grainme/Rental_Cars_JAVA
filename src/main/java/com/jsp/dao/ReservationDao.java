package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Reservation;
import com.jsp.dto.User;

public class ReservationDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("wraaqi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Reservation saveReservation(Reservation reservation) {
		et.begin();
		em.persist(reservation);
		et.commit();
		em.close();
		return reservation;
	}
	
	public List<Reservation> getAllReservation(){
		Query query = em.createQuery("SELECT r FROM Reservation r");
		List<Reservation> ListOfReservations = query.getResultList();
		return ListOfReservations;
	}

	public List<Reservation> getListOfReservationByUser(User user) {
	    return user.getListOfReservation();
	}

	public Reservation getReservationById(int id) {
		Query query = em.createQuery("SELECT r FROM Reservation r WHERE r.id = :id");
		query.setParameter("id", id);
		List<Reservation> ListOfReservations = query.getResultList();
		return ListOfReservations.get(0);
	}

	public void deleteReservation(int id) {
	    try {
	        et = em.getTransaction();
	        et.begin();

	        Query query = em.createQuery("DELETE FROM Reservation r WHERE r.reservationId = :id");
	        query.setParameter("id", id);
	        query.executeUpdate();

	        et.commit();
	    } catch (Exception e) {
	        if (et != null && et.isActive()) {
	            et.rollback();
	        }
	        e.printStackTrace(); 
	    } finally {
	        if (et != null && et.isActive()) {
	            et.rollback();
	        }
	        System.out.println("DELETE HAS BEEN LAUNCHED!");
	    }
	}

}
