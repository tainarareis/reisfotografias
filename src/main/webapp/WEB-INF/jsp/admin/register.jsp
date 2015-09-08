<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem-vindo(a) ao cadastro para novos administradores</h1>
	<form action="register" method="POST">
		<input type="text" name="admin.name"/>
		<input type="text" name="admin.login"/>
		<input type="text" name="admin.email"/>
		<input type="password" name="admin.password"/>
		<input type="submit" value="Cadastrar"/>
	</form>


</body>
</html>