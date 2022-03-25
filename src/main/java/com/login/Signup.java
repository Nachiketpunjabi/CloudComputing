package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.SignupDao;


@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Signup() {
        super();
        
    }
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mis= request.getParameter("mis");
		String firstname= request.getParameter("firstname");		
		String lastname= request.getParameter("lastname");
		String dob= request.getParameter("dob");	
		String contact= request.getParameter("contact");
		String course= request.getParameter("course");	
		String subject_name= request.getParameter("subject_name");
		String T1= request.getParameter("T1");	
		String T2= request.getParameter("T2");
		String End_sem= request.getParameter("End_sem");	
		SignupDao Sdao= new SignupDao();
		
		Sdao.insertData(mis, firstname, lastname, dob, contact, course, subject_name, T1, T2, End_sem );
		
		response.sendRedirect("login.jsp");
		
	}

}
