package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.MySqlConnection;
import model.Evento;

public class EventoDAO {
	
	public static void insere(Evento evento) throws SQLException{
        String sql="INSERT INTO evento(titulo, data, local, descricao, status) VALUES (?,?,?,?,?) ";
        Connection conn= null;
        PreparedStatement pstm=null;
        try{
        	conn = MySqlConnection.createConnection();
            pstm= (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,evento.getTituloEvento());
            pstm.setString(2,evento.getData());
            pstm.setString(3,evento.getLocal());
            pstm.setString(4,evento.getDescricao());
            pstm.setString(5,evento.getStatus());
            
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            if(pstm!=null)pstm.close();
            if(conn!=null)conn.close();
        }
             
    }
	
	//Lista usuários do banco
    public static ArrayList<Evento> listarBD(){
    	 
    	 String sql = "SELECT * FROM evento";
    	 ArrayList<Evento> lista = new ArrayList<Evento>();
    	 
    	 Connection conn = null;
    	 PreparedStatement pstm = null;
    	 ResultSet rset = null;
    	 
    	 try {
    		 conn = MySqlConnection.createConnection();
    		 pstm = conn.prepareStatement(sql);
    		 rset = pstm.executeQuery();
    	 
    		 //Enquanto existir dados no banco de dados, fa�a
    		 while(rset.next()){
    	 
    			 Evento evento = new Evento();    	 
    			 
		    	 //Recupera dados do banco e atribui ele ao objeto
		    	 evento.setTituloEvento(rset.getString("titulo"));
		    	 evento.setData(rset.getString("data"));
		    	 evento.setLocal(rset.getString("local"));
		    	 evento.setDescricao(rset.getString("descricao"));
		    	 evento.setStatus(rset.getString("status"));
		    	 
		    	 lista.add(evento);
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
