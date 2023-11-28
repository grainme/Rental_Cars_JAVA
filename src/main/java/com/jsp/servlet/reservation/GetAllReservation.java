package com.jsp.servlet.reservation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.*;
import com.jsp.service.*;

@WebServlet("/listAdminReservation")
public class GetAllReservation extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationService reservationService = new ReservationService();

		request.setAttribute("ListAdminReservation", reservationService.getListOfReservation());
		request.getRequestDispatcher("ListAdminReservations.jsp").forward(request, response);
	}
}
