<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/estilo.css">

<meta charset="ISO-8859-1">
<title>Cadastrar Evento</title>
</head>
<body>
	<nav class="bananaNav">
		<ul>
			<li><span style="color: yellow">Gerenciador de eventos</span></li>
            <li><a href="cadastrarEvento.jsp">Cadastrar Evento</a></li>
            <li><a href="listarEvento.jsp">Consultar Evento</a></li>
            <li><a href="cadastrarUsuario.jsp">Cadastrar Usuário</a></li>
            <li><a href="listarUsuario.jsp">Consultar Usuário</a></li>
            <li><a href="login.jsp">Login</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="cadastrarEvent" method="post" class="bananaForm">
			<div>
            <label><strong>Título:</strong></label><input type="text" name="titulo">
	        </div>
	        <div>
	            <label><strong>Data:</strong></label><input type="text" name="data">
	        </div>
	        <div>
	            <label><strong>Local:</strong></label><input type="text" name="local">
	        </div>
	        <div>
	            <label><strong>Descrição:</strong></label><input type="text" name="descricao">
	        </div>
	        <div>
	            <label><strong>Status:</strong></label><input type="checkbox" name="status" value="concluido">
	        </div>
	        <div>
	            <input type="submit" name="salvar" value="Cadastrar Evento">
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