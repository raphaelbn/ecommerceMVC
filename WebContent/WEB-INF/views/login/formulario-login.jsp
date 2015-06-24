<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Login Web</title>
	</head>
	<body>
		<h2>Página de Login</h2>
		<form action="auditLogin" method="post">
			<div>
				Login: <input type="text" name="usuario" /> <br /> 
				Senha: <input type="password" name="senha" /> <br />
			</div>
			<input type="submit" value="Entrar nas tarefas" />
		</form>
	</body>
</html>