package com.jsp.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

@WebServlet("/testing")
public class Testing extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		Properties props = new Properties();
		props.load(new FileInputStream("authentication.properties"));
		
		if(props.getProperty(name)!=null && props.getProperty(name).equals(pass)) {
			out.append("YAYYYA");
		}
		else {
			out.append("NAAAAH");
		}
	}
}
