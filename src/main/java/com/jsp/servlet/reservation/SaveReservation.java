package com.jsp.servlet.reservation;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Car;
import com.jsp.dto.Reservation;
import com.jsp.dto.User;
import com.jsp.service.CarService;
import com.jsp.service.ReservationService;
import com.jsp.service.UserService;

@WebServlet("/saveReservation")
public class SaveReservation extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ReservationService reservationService = new ReservationService();
        UserService userService = new UserService();
        CarService carService = new CarService();

        
        User user = userService.findUserById(Integer.parseInt(request.getParameter("user_id")));
        
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        
        // Retrieve parameters from the request
        long carId = Long.parseLong(request.getParameter("car_Id"));
        String paymentStatus = request.getParameter("payment_Status");
        String pickupDateStr = request.getParameter("pickup_date");
        String returnDateStr = request.getParameter("return_date");
        LocalDate localDate1 = LocalDate.parse(pickupDateStr);
        LocalDate localDate2 = LocalDate.parse(returnDateStr);

        Period intervalPeriod = Period.between(localDate1, localDate2);
        
        request.setAttribute("CardId", carId);
        request.setAttribute("UserId", user.getUser_id());

        try {
            Car car = carService.getCarById(carId);
            Date pickupDate = Date.valueOf(pickupDateStr);
            Date returnDate = Date.valueOf(returnDateStr);
            double totalCost = intervalPeriod.getDays() * car.getRentalRate();
            request.setAttribute("totalCost", totalCost);
            Reservation reservation = new Reservation(user, car, pickupDate, returnDate, totalCost, paymentStatus);
            reservationService.saveReservation(reservation);
            car.setAvailable(false);
            carService.SwitchAvailabilityCar(car);
            if(paymentStatus!=null && paymentStatus.equals("Pending")) {
            	request.getRequestDispatcher("checkout.jsp").forward(request, response);
            }
            else {
                request.getRequestDispatcher("orderPlaced.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.out.println("Hello, Error!");
        }
    }
}
