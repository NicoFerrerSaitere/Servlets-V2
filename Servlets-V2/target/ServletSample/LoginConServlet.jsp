<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login con servlets</title>
</head>
<body>
	<h3>Login</h3>
	<form action="LoginConServlet" method="post">
	Usuario: <input type="text" name="usuario"><br/>
	Contraseña: <input type="text" name="pass"><br/>
	<input type="submit" name="enviar" value="Iniciar Sesión">
	</form>


</body>
</html>