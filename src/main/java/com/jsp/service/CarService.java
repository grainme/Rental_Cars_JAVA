package com.jsp.service;

import java.util.List;

import com.jsp.dao.CarDao;
import com.jsp.dto.Car;

public class CarService {
	
	CarDao carDao = new CarDao();
	
	public Car saveCar(Car car) {
		return carDao.saveCar(car);
	}
	
	public Car getCarById(Long carId) {
		return carDao.getCarById(carId);
	}
	
	public List<Car> getAllCars(){
		return carDao.getAllCars();
	}
	
	public Car SwitchAvailabilityCar(Car car) {
		return carDao.SwitchAvailabilityCar(car);
	}
}
