<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String id=request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "nachiket";
String userid = "root";
String password = "1234";
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
ResultSet resultSet2=null;
try
{
	connection = DriverManager.getConnection(connectionUrl+database, userid, password);
	statement=connection.createStatement();
	int i=statement.executeUpdate("DELETE FROM users WHERE MIS="+id);
	
}
catch(Exception e)
{
e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Done
</body>
</html>