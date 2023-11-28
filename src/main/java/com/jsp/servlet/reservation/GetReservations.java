package com.jsp.servlet.reservation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.*;
import com.jsp.service.*;

@WebServlet("/listReservation")
public class GetReservations extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationService reservationService = new ReservationService();
		
		UserService userService = new UserService();
		
		int userId = Integer.parseInt(request.getParameter("user_id"));

		User user = userService.findUserById(userId);
		
		request.setAttribute("ListOfReservation", reservationService.getListOfReservationByUser(user));
		request.getRequestDispatcher("ListOfReservations.jsp").forward(request, response);
	}
}
