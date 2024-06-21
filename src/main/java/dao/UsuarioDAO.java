package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioDAO {
	
	public static void insere(Usuario user) throws SQLException{
        String sql="INSERT INTO usuario(nome,login,senha) VALUES (?,?,?) ";
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
            conn= MySqlConnection.createConnection();
            pstm= (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,user.getNome());
            pstm.setString(2, user.getLogin());
            pstm.setString(3,user.getSenha());
            
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            if(pstm!=null)pstm.close();
            if(conn!=null)conn.close();
        }
             
    }
	
	//Lista usuários do banco
    public static ArrayList<Usuario> listarBD(){
    	 
    	 String sql = "SELECT * FROM usuario";
    	 ArrayList<Usuario> lista = new ArrayList<Usuario>();
    	 
    	 Connection conn = null;
    	 PreparedStatement pstm = null;
    	 ResultSet rset = null;
    	 
    	 try {
    		 conn = MySqlConnection.createConnection();
    		 pstm = conn.prepareStatement(sql);
    		 rset = pstm.executeQuery();
    	 
    		 while(rset.next()){
    	 
    			 Usuario user = new Usuario();    	 
		    	 user.setNome(rset.getString("nome"));
		    	 user.setLogin(rset.getNString("login"));
		    	 user.setSenha(rset.getNString("senha"));
		    	 
		    	 lista.add(user);
    		 }
    	 } catch (Exception e) {
    		 e.printStackTrace();
    		 
    	 }finally{
    		 try{
    			 if(rset != null){
    				 rset.close();
    			 }
    	 
    			 if(pstm != null){
    				 pstm.close();
    			 }
    			 
    			 if(conn != null){
    				 conn.close();
    			 }
    	 
    		 }catch(Exception e){
    			 e.printStackTrace();
    		 }
    	 }
    	 return lista;
    }
}
