<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<center>
		<h1>Welcome to Online Help Services</h1>
		<sf:form action="/register" method="post" modelAttribute="register">
			<table>
				<tr>
					<td><sf:label path="userName">UserName:</sf:label></td>
					<td><sf:input path="userName" id="userName"></sf:input></td>
					<td><sf:errors path="userName" /></td>
				</tr>
				<tr>
					<td><sf:label path="contactNumber">Contact Number</sf:label></td>
					<td><sf:input path="contactNumber" id="contactNumber" /></td>
					<td><sf:errors path="contactNumber" /></td>
				</tr>
				<tr>
					<td><sf:label path="emailId">Email Id</sf:label></td>
					<td><sf:input path="emailId" id="emailId" /></td>
					<td><sf:errors path="emailId" /></td>
				</tr>
				<tr>
					<td><sf:label path="confirmEmailId">Confirm Email Id</sf:label></td>
					<td><sf:input path="confirmEmailId" id="confirmEmailId" /></td>
					<td><sf:errors path="confirmEmailId" /></td>
				</tr>
				<tr>
					<td><sf:checkbox path="status" id="status" /></td>
					<td><sf:label path="status">I agree</sf:label>
					<td><sf:errors path="status" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Register" /></td>
					<td><input type="reset" value="Cancel" /></td>
				</tr>
			</table>
		</sf:form>
	</center>
</body>
</html>
