package com.jsp.servlet.reservation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.service.*;


@WebServlet("/deleteRes")
public class DeleteReservation extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("reservationId"));
		ReservationService reservationService = new ReservationService();
		reservationService.deleteReservation(id);
		request.getRequestDispatcher("loginPage.jsp").forward(request, response);
	}

}
