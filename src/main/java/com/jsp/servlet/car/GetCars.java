package com.jsp.servlet.car;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import com.jsp.dto.Car;
import com.jsp.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.User;

@WebServlet("/listCars")
public class GetCars extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarService carService = new CarService();
		
		int year = -1;
		
		if(request.getParameter("year")!=null && !request.getParameter("year").isEmpty()) {
			year = Integer.parseInt(request.getParameter("year"));
		}
		
		String model = request.getParameter("model");


		List<Car> listOfCars = carService.getAllCars();
		List<Car> filteredListOfCars = new ArrayList<>();

		for(Car car: listOfCars) {
			if(year!=-1 && model!=null && model.length()>0) {
				if(car.getProduction_year()==year && car.getModel().equals(model) == true) {
					filteredListOfCars.add(car);
				}
			}
			else if(year!=-1) {
				if(car.getProduction_year()==year) {
					filteredListOfCars.add(car);
				}
			}
			else if(model!=null && model.length()>0) {
				if(car.getModel().equals(model) == true) {
					filteredListOfCars.add(car);
				}
			}
		}
		
		if(filteredListOfCars.size() ==0) {
			filteredListOfCars = listOfCars;
		}
		
		UserService userService = new UserService();

		User user = userService.findUserById(Integer.valueOf(request.getParameter("user_id")));

		request.setAttribute("user", user);
		request.setAttribute("listOfCars", filteredListOfCars);
		request.getRequestDispatcher("CarsRepo.jsp").forward(request, response);
	}
}
