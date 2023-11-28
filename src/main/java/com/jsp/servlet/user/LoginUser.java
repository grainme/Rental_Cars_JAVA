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

@WebServlet("/loginuser")
public class LoginUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");


        UserService userService = new UserService();
        User user = userService.findUserByNameAndPass(username, password, role);
        
        req.setAttribute("userInfos", user);
        
        if (user != null) {
            if ("client".equals(role)) {
                req.getRequestDispatcher("home.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("homeAdmin.jsp").forward(req, resp);
            }
        } else {
            req.getRequestDispatcher("loginPage.jsp").forward(req, resp);
        }

    }
}
