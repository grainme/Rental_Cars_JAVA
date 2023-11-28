package com.jsp.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.User;
import com.jsp.service.UserService;

@WebServlet("/getusers")
public class GetUsers extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService userService = new UserService();
		List<User> ListOfUsers = userService.getUsers();

		
		 req.setAttribute("users", ListOfUsers);
		 req.getRequestDispatcher("userList.jsp").forward(req, resp);

	}

}
