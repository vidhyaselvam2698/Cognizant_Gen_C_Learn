<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: lavender">
	<center>
		<h1>ZEE-ZEE Web Portal</h1>
		<sf:form action="/submitLogin" method="post" modelAttribute="login" >
			<table>
				<tr>
					<td>
						<sf:label path="userName">UserName:</sf:label>
					</td>
					<td>
						<sf:input path="userName" id="userName" name="userName" />
					</td>
				</tr>
				<tr>
					<td>
						<sf:label path="password">Password</sf:label>
					</td>
					<td>
						<sf:password path="password" id="password" name="password" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="submit" value="Login" />
					</td>
					<td>
						<input type="reset" name="cancel" value="Cancel" />
					</td>
				</tr>
			</table>
		</sf:form>
	</center>
</body>
</html>