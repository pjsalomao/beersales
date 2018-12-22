<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exibe Lista</title>
</head>
<body>
<h1>Carrinho</h1>
<form action="CarrinhoCompras?cmd=listar" method="get">
<c:forEach var="catalogo" items="${requestScope.cats}">  
      <c:out value="${catalogo.descricao}"/> 
      <c:out value="${catalogo.estilo}"/>
      <c:out value="${catalogo.valorAtual}"/>   
</c:forEach> 
</form>
</body>
</html>