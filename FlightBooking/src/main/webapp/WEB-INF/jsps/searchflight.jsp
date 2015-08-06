<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome ${login.username} </h1>

<form:form commandName="searchflight">
<table>
<tr>
</tr>
<tr>
<td>From:</td>
<td>
	<form:select path="fromPlace">
		<form:option value="" label="-----Select------"/>
		<form:options items="${fromPlaceList}"/>	
	</form:select>
</td>

</tr>

<tr>
	<td>To:</td>
	<td>
		<form:select path="toPlace">
			<form:option value="" label="-----Select------"/>
			<form:options items="${fromPlaceList}"/>	
		</form:select>
</td>
</tr>
<tr>
<td>FromDate:</td>
<td><form:input path="fromDate"/></td>
</tr>
<tr>
<td>ToDate:</td>
<td><form:input path="toDate"/></td>
</tr>
<tr>
<td>Passengers Count:</td>
<td><form:input path="passCount"/></td>
<td colspan="10">
			<input type="submit" value="Submit">

</td>
</tr>

</table>
</form:form>
</body>
</html>
