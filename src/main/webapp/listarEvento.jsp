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
            <li><a href="listarUsuario.jsp">Consultar Usuário</a></li>
            <li><a href="login.jsp">Login</a></li>
        </ul>
    </nav>
    <main class="bananaMain">
        <div class="bananaForm">
            <%
                List<Evento> eventos = (List<Evento>) request.getAttribute("eventos");
                if (eventos != null && !eventos.isEmpty()) {
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
            <% } %>
            <% } else { %>
            <div class="bananaDivMother">
                <div class="bananaDivItem">
                    <p>Nenhum evento encontrado.</p>
                </div>
            </div>
            <% } %>
        </div>
    </main>
    
    <script>
    // Redireciona para "/Projeto/listarEventos" após 5 segundos, exceto se já estiver nessa página
    setTimeout(function() {
        var currentUrl = window.location.href;
        var targetUrl = "/Projeto/listarEventos";
        
        // Verifica se a URL atual é diferente da URL alvo antes de redirecionar
        if (currentUrl !== ("http://localhost:8080" + targetUrl)) {
            window.location.replace(targetUrl);
        }
    }, 0); // 5000 milissegundos = 5 segundos
</script>

</body>
</html>
