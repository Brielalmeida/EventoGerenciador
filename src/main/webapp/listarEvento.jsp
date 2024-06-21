<%@page import="model.Evento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listar Eventos</title>
    <link rel="stylesheet" href="css/estilo.css">
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
        <div class="bananaForm">
            <%
                List<Evento> eventos = (List<Evento>) request.getAttribute("eventos");
                if (eventos != null) {
                    for (Evento evento : eventos) {
            %>
            <div class="bananaDivMother">
                <div class="bananaDivItem">
                    <div class="bananaColumn">
                        <span style="font-weight: bold">Título</span>
                        <span><%= evento.getTituloEvento() %></span>
                    </div>
                    <div class="bananaColumn">
                        <span style="font-weight: bold">Data</span>
                        <span><%= evento.getData() %></span>
                    </div>
                    <div class="bananaColumn">
                        <span style="font-weight: bold">Local</span>
                        <span><%= evento.getLocal() %></span>
                    </div>
                    <div class="bananaColumn">
                        <span style="font-weight: bold">Descrição</span>
                        <span><%= evento.getDescricao() %></span>
                    </div>
                    <div class="bananaColumn">
                        <span style="font-weight: bold">Status</span>
                        <span><%= evento.getStatus() %></span>
                    </div>
                </div>
            </div>
            <%
                    }
                }
            %>
        </div>
    </main>
</body>
</html>
