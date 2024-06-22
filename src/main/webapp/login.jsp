<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/estilo.css">
    <meta charset="ISO-8859-1">
    <title>Login</title>
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
        <form action="LoginServleto" method="post" class="bananaForm">
            <div>
                <label><strong>Login:</strong></label><input type="text" name="login">
            </div>
            <div>
                <label><strong>Senha:</strong></label><input type="password" name="senha">
            </div>
            
            <div>
                <input type="submit" value="Login">
            </div>
            
            <div>
                <% String mensagem = (String) request.getAttribute("mensagem");
                if (mensagem != null) {
                    out.print("<p>" + mensagem + "</p>");
                } %>
            </div>
        </form>
    </main>
</body>
</html>
