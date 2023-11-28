package com.jsp.service;

import java.util.List;

import com.jsp.dao.ReservationDao;
import com.jsp.dto.Reservation;
import com.jsp.dto.User;

public class ReservationService {

	ReservationDao reservationDao = new ReservationDao();
	
	public Reservation saveReservation(Reservation reservation) {
		return reservationDao.saveReservation(reservation);
	}
	
	public Reservation getReservationById(int id) {
		return reservationDao.getReservationById(id);
	}
	
	public List<Reservation> getListOfReservation() {
		return reservationDao.getAllReservation();
	}
	
	public List<Reservation> getListOfReservationByUser(User user) {
		return reservationDao.getListOfReservationByUser(user);
	}
	
	public void deleteReservation(int id) {
		reservationDao.deleteReservation(id);
	}
}	
