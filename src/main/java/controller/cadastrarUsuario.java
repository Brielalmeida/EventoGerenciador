package controller;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Usuario;
import dao.UsuarioDAO;

@WebServlet("/cadastrarUsuario")
public class cadastrarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        Usuario user = new Usuario();
        user.setNome(nome);
        user.setLogin(login);
        user.setSenha(senha);

        try {
            UsuarioDAO.insere(user);
            request.setAttribute("mensagem", "Usuário Cadastrado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("mensagem", "Erro ao cadastrar usuário.");
        }

        request.getRequestDispatcher("cadastrarEvento.jsp").forward(request, response);
    }
}
