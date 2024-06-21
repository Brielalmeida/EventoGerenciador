package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Evento;
import dao.EventoDAO;

@WebServlet("/listarEventos")
public class listarEvento extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            List<Evento> eventos = EventoDAO.listarBD(); // Método para obter todos os eventos do banco de dados
            request.setAttribute("eventos", eventos); // Define os eventos como atributo da requisição
        

        // Encaminha a requisição para a página JSP que exibirá os eventos
        request.getRequestDispatcher("listarEvento.jsp").forward(request, response);
    }
}