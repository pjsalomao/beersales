<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"></meta>
<title>Insert title here</title>
</head>
<body>
   <h3>Beer Sales</h3>   
   <form action="EnviarDados?cmd=cadastrar" method="post">
   
	  
	 <input type="button" value="Produtos" onClick="window.location.href='http://localhost:8080/br.com.beersales-api3/cadastroProduto.jsp'">
      <br /><br />
	 <input type="button" value="Carrinho de compras" onClick="window.location.href='http://localhost:8080/br.com.beersales-api3/insereCarrinho.jsp'">
   </form>
   <br /><br />
 
</body>
</html>