package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	
	public Login() {
		super();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username= request.getParameter("mis");
		String pass= request.getParameter("contact");		

		
		LoginDao Dao= new LoginDao();
		
		if(Dao.check(username, pass)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("report.jsp");
			
		}
		else {
//			response.sendRedirect("welcome.jsp");
			response.sendRedirect("login.jsp");
		}
		
	}

	

}
