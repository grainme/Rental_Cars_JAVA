package com.jsp.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.User;
import com.jsp.service.UserService;


@WebServlet("/saveuser")
public class SaveUser extends HttpServlet {
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");


        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRole("client");
        user.setUsername(username);
        
        UserService userService = new UserService();
        User user1 = userService.saveUser(user);

        if (user1 != null) {
            resp.sendRedirect("loginPage.jsp");
        } else {
            resp.sendRedirect("error.jsp");
        }
    }
}
