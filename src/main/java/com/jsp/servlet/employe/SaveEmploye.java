package com.jsp.servlet.employe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employe;
import com.jsp.service.*;


@WebServlet("/saveEmployee")
public class SaveEmploye extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		EmployeService employeService = new EmployeService();
		String name = req.getParameter("name");
		String adress = req.getParameter("ad");
		
		Employe employe = new Employe();
		employe.setPersNumber(1L);
		employe.setAdress(adress);
		employe.setName(name);
		Employe emp = employeService.updateEmploye(employe);
		System.out.println(emp.getAdress()+emp.getName()+emp.getPersNumber());
		req.getRequestDispatcher("index.jsp").forward(req, res);
	}
}
