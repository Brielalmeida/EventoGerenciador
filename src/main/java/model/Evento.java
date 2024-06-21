package model;

public class Evento {
    private String tituloEvento;
    private String data;
    private String local;
    private String descricao;
    private String status;

    public Evento(){
    }
    
    public Evento(String tituloEvento, String data, String local, String descricao, String status) {
        this.tituloEvento = tituloEvento;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
        this.status = status;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }
    
    
    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return ("\n Titulo: "+tituloEvento+ " Data "+data+ " Local "+local+ " Descricao "+descricao+" status "+status);
    }
}
