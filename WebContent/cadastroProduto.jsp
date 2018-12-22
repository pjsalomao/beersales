<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"></meta>
<title>Insert title here</title>
</head>
<body>
   <h3>Cadastro de Produtos</h3>   
   <form action="CadastroProdutos?cmd=cadastrar" method="post">
      <input type="button" value="Voltar" onClick="history.go(-1)"> 
	  <br /><br />
	  Fabricante: <input type="text" name="fabricante" />
      <br /><br />        
	  Nome: <input type="text" name="nome" />
      <br /><br /> 
	  Registro: <input type="text" name="registro" />
      <br /><br />	  
	  Data Lançamento: <input type="text" name="lancamento" />
      <br /><br />
      Estilo: <input type="text" name="estilo" />
      <br /><br />
      Teor Alcoolico: <input type="text" name="teorAlcoolico" />
      <br /><br />
      <input type="submit" value="Salvar" />
	  <br/><br/> 
	 
   </form>
	<br/>
	<form action="CadastroProdutos?cmd=cadastrarPreco" method="post">
	 Id do produto <input type="text" name="idProduto" />
     <br /><br /> 
	 Preço atual  <input type="text" name="precoAtual" />
     <br /><br /> 
	 Preco Anterior <input type="text" name="precoAnterior" />
     <br /><br /> 
     <input type="submit" value="Cadastrar Preço" /> 
     </form>
   <br /><br />
   ${msg }   
</body>
</html>