package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignupDao {

	String sql="insert into studentBasic(MIS, FirstName, LastName, DOB, Contact)values(?,?,?,?,?)";

	String sql2="insert into studentMarks(MIS, Course, Subject_Name, T1, T2, End_sem)values(?,?,?,?,?,?)";
	String url="jdbc:mysql://localhost:3306/nachiket";
	String username="root";
	String password="1234";
	
	public void insertData(String mis, String firstname, String lastname, String dob, String contact, String course, String subject_name, String T1, String T2, String End_sem) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,mis);
			st.setString(2, firstname);
			st.setString(3, lastname);
			st.setString(4, dob);
			st.setString(5, contact);
			
			PreparedStatement st2 = con.prepareStatement(sql2);
			st2.setString(1,mis);
			st2.setString(2, course);
			st2.setString(3, subject_name);
			st2.setString(4, T1);
			st2.setString(5, T2);
			st2.setString(6, End_sem);
			st.executeUpdate();
			st2.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
