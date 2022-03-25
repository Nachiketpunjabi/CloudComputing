<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "nachiket";
String userid = "root";
String password = "1234";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
ResultSet resultSet2=null;
%>
<!DOCTYPE html>
<html>
<body>

<h1>Retrieve data from database in jsp</h1>

<table border="1">
<tr>
<td>MIS</td>
<td>FirstName</td>
<td>Lastname</td>
<td>Date of Birth</td>
<td>Contact</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from studentBasic";
String sql2="select * from studentMarks";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>

<td><%=resultSet.getString("MIS") %></td>
<td><%=resultSet.getString("FirstName") %></td>
<td><%=resultSet.getString("LastName") %></td>
<td><%=resultSet.getString("DOB") %></td>
<td><%=resultSet.getString("Contact") %></td>


</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 



<table border="1">
<tr>
<td>MIS</td>
<td>Course</td>
<td>Subject</td>
<td>T1</td>
<td>T2</td>
<td>End Sem</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql2="select * from studentMarks";
resultSet = statement.executeQuery(sql2);
while(resultSet.next()){
%>
<tr>

<td><%=resultSet.getString("MIS") %></td>
<td><%=resultSet.getString("Course") %></td>
<td><%=resultSet.getString("Subject_Name") %></td>
<td><%=resultSet.getString("T1") %></td>
<td><%=resultSet.getString("T2") %></td>
<td><%=resultSet.getString("End_sem") %></td>

</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 




</body>
</html>