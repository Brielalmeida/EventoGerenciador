package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlConnection {
	private static final String USERNAME="root";
    private static final String PASSWORD="admin";
    private static final String DATABASE_URL="jdbc:mysql://localhost:3306/projeto";
    
    public static Connection createConnection() throws SQLException, ClassNotFoundException{
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return conn;
}

}
