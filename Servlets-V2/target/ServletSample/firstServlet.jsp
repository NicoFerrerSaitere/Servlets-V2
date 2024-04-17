<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hola Mundo con Servlets</title>
</head>
<body>
	Enter Username and Email ID using GET method
	<h3>Inicio de Sesion</h3>
	<form action="FirstServlet" method="get">
		Username: <input type="text" name="uname"><br /> 
		Email ID: <input type="text" name="email"><br /> 
		<input type="submit" name="enviar" value="Inicia sesion">
		 <br />
	</form>
	<br />
	<br />
	<br />
	<br /> Enter Username and Email ID using POST method
	<h3>Notice the queryString is not present in the URL as the query
		string is sent in the body</h3>
	<form action="FirstServlet.java" method="post">
		Username: <input type="text" name="uname"><br /> 
		Email ID: <input type="text" name="email"><br /> 
		<input type="submit" name="enviar" value="Inicio de sesion">
		<br /> 

	</form>
</body>
</html>