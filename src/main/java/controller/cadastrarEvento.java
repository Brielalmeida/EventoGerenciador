package controller;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Evento;
import dao.EventoDAO;

@WebServlet("/cadastrarEvent")
public class cadastrarEvento extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String data = request.getParameter("data");
        String local = request.getParameter("local");
        String descricao = request.getParameter("descricao");
        String status = request.getParameter("status") != null ? "concluido" : "não feito";

        Evento evento = new Evento();
        evento.setTituloEvento(titulo);
        evento.setData(data);
        evento.setLocal(local);
        evento.setDescricao(descricao);
        evento.setStatus(status);

        try {
            EventoDAO.insere(evento);
            request.setAttribute("mensagem", "Evento cadastrado com status: " + status);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("mensagem", "Erro ao cadastrar evento.");
        }

        request.getRequestDispatcher("cadastrarEvento.jsp").forward(request, response);
    }
}
