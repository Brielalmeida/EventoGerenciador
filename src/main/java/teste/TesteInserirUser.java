package teste;

import java.sql.SQLException;

import dao.EventoDAO;
import dao.UsuarioDAO;
import model.Usuario;
import model.Evento;

public class TesteInserirUser {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		EventoDAO.insere(new Evento("Licao","2024-06-21","São Paulo", "Tecnica de programação", "não iniciadoi"));
	}
}
