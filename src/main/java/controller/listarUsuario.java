package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Usuario;
import dao.UsuarioDAO;

@WebServlet("/listarUsuarios")
public class listarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            List<Usuario> usuarios = UsuarioDAO.listarBD(); // Método para obter todos os eventos do banco de dados
            request.setAttribute("usuarios", usuarios); // Define os eventos como atributo da requisição
        

        // Encaminha a requisição para a página JSP que exibirá os eventos
        request.getRequestDispatcher("listarUsuario.jsp").forward(request, response);
    }
}