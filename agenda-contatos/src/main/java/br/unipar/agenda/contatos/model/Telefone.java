package br.unipar.agenda.contatos.model;


public class Telefone {
    
    private int id;
    private int nrDdd;
    private String nrTelefone;
    private String tipoTelefone;
    
    public Telefone(){
        
    }

    public Telefone(int id, int nrDdd, String nrTelefone, String tipoTelefone) {
        this.id = id;
        this.nrDdd = nrDdd;
        this.nrTelefone = nrTelefone;
        this.tipoTelefone = tipoTelefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrDdd() {
        return nrDdd;
    }

    public void setNrDdd(int nrDdd) {
        this.nrDdd = nrDdd;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", nrDdd=" + nrDdd + ", nrTelefone=" + nrTelefone + ", tipoTelefone=" + tipoTelefone + '}';
    }
    
    
    
}
