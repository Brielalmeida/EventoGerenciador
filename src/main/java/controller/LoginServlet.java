package controller;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.Usuario;
import dao.UsuarioDAO;

@WebServlet("/LoginServleto")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);

        try {
            // Verifica se o usuário existe no banco de dados
            Usuario usuarioAutenticado = UsuarioDAO.autenticar(usuario);

            if (usuarioAutenticado != null) {
                // Usuário autenticado, cria sessão
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usuarioAutenticado);

                // Redireciona para página após login
                request.setAttribute("mensagem", "Usuário autenticado com sucesso.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                // Usuário não encontrado ou senha incorreta
                request.setAttribute("mensagem", "Usuário ou senha inválidos");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("mensagem", "Erro ao autenticar usuário.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

