package teste;

import dao.EventoDAO;
import model.Usuario;

public class TesteListarUser {
	public static void main(String[] args) {
		System.out.println(EventoDAO.listarBD());
	}
}
