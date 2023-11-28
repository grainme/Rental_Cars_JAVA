package com.jsp.servlet.car;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jsp.dto.Car;
import com.jsp.service.CarService;


@WebServlet("/savecar")
public class SaveCar extends HttpServlet {
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String model = req.getParameter("model");
        String available = req.getParameter("available");
        String prod_year = req.getParameter("prod_year");
        String rental = req.getParameter("rental");

        Car car = new Car();
        
        car.setAvailable(true);
        car.setModel(model);
        car.setProduction_year(Integer.parseInt(prod_year));
        car.setRentalRate(Integer.parseInt(rental));
        
        
        CarService carService = new CarService();
        Car car1 = carService.saveCar(car);
        
        System.out.println(car1.getModel());

        if (car1 != null)
        {
            resp.sendRedirect("loginPage.jsp");
        }
        else
        {
            resp.sendRedirect("error.jsp");
        }
    }
}
