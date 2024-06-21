package teste;

import java.sql.Connection;
import java.sql.SQLException;

import dao.MySqlConnection;

public class teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn;
         conn= MySqlConnection.createConnection();// criar a conex�o
         System.out.println("Conexão sucesso!");
        
	}

}
