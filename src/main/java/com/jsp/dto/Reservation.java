package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import java.sql.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int reservationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "carId") 
    Car car;

    @Column(name = "pickup_date")
    private java.sql.Date pickupDate;

    @Column(name = "return_date")
    private java.sql.Date returnDate;

    @Column(name = "total_cost")
    private double totalCost;

    @Column(name = "payment_status")
    private String paymentStatus;

    public Reservation() {
    }

    public int getReservationId() {
		return reservationId;
	}


	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}


	public Reservation(User user, Car car, Date pickupDate, Date returnDate, double totalCost, String paymentStatus) {
		this.user = user;
		this.car = car;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
		this.totalCost = totalCost;
		this.paymentStatus = paymentStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}


	public java.sql.Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(java.sql.Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public java.sql.Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(java.sql.Date returnDate) {
		this.returnDate = returnDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
    
}
