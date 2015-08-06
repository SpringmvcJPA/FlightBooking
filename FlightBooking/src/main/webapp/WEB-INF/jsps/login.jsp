<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BlueSkies FlightBooking</title>
</head>
<body>
<h1>BlueSkies FlightBooking Login</h1>
<form:form commandName="login">
	<table>
		<tr>
			<td>User Name:</td>
			<td>
				<form:input path="username"/>			
			</td>		
		</tr>
		<tr>       
		<td>Password:</td>
			<td>
				<form:input path="password"/>			
			</td>	
		</tr>
		<tr>
			<td colspan="10">
			<input type="submit" value="Login">
			</td>
		</tr>


	</table>


</form:form>
</body>
</html>