package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deletedao {
	String sql="DELETE FROM studentBasic WHERE MIS=?";

	String url="jdbc:mysql://localhost:3306/nachiket";
	String username="root";
	String password="1234";
	
	public void deleteData(String id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,id);
			st.executeUpdate();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
}
