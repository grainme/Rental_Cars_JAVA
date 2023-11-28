package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.Column;

@Entity
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long carId;

    @Column(name = "model")
    private String model;

    @Column(name = "available")
    private boolean available;

    @Column(name = "rental_rate")
    private double rentalRate;
    
    @Column(name = "production_year")
    private int production_year;
    
    @OneToMany(mappedBy = "car")
    List<Reservation> ListOfReservation;
   

	public Car() {
    }

    public Car(String model, boolean available, double rentalRate) {
        this.model = model;
        this.available = available;
        this.rentalRate = rentalRate;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    

    public int getProduction_year() {
		return production_year;
	}

	public void setProduction_year(int production_year) {
		this.production_year = production_year;
	}
}

