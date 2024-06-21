<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/estilo.css">

<meta charset="ISO-8859-1">
<title>Cadastrar Usuário</title>
</head>
<body>
	<nav class="bananaNav">
		<ul>
			<li><span style="color: yellow">Gerenciador de eventos</span></li>
			<li><a href="cadastrarEvento.jsp">Cadastrar Evento</a></li>
			<li><a href="listarEvento.jsp">Consultar Evento</a></li>
			<li><a href="cadastrarUsuario.jsp">Cadastrar Usuário</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="cadastrarUsuario" method="post" class="bananaForm">
			<div>
            <label><strong>Nome:</strong></label><input type="text" name="nome">
	        </div>
	        <div>
	            <label><strong>Login:</strong></label><input type="text" name="login">
	        </div>
	        <div>
	            <label><strong>Senha:</strong></label><input type="text" name="senha">
	        </div>
	        
	        <div>
	            <input type="submit" name="salvar" value="Cadastrar Usuario">
	        </div>
	        
	        <div>
	            <%
				String mensagem = (String) request.getAttribute("mensagem");
				if (mensagem != null)
					out.print(mensagem);
				%>
	        </div>
		</form>
	</main>
</body>
</html>