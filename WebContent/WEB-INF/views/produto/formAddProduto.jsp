<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Add Produto
	<form action="addProduto" method="post">

		Nome:<input type="text" name="nome" id="labelNome"><br>
		Tipo:<input type="text" name="email" id="labelEmail"><br>
		Valor:<input type="text" name="devendo" id="labelDevendo"><br>
		Descrição:<input type="text" name="devendo" id="labelDevendo"><br>

		<input type="submit" value="Salvar" id="button">
	</form>
</body>
</html>