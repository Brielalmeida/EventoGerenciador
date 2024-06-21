package model;

public class Usuario {

    private String nome;
    private String login;
    private String senha;
 
    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario() {}
 
    public String getNome() {
        return this.nome;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public void setLogin(String login) {
    	this.login = login;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    @Override
    public String toString() {
        return ("\n Nome: "+nome+ " Login "+login+ " Senha "+senha);
    }
	
}
