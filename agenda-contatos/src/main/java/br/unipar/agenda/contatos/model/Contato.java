package br.unipar.agenda.contatos.model;

import java.util.ArrayList;

public class Contato {
    
    private String nmContato;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;

    public Contato() {
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>(); 
    }
    

    public String getNmContato() {
        return nmContato;
    }

    public void setNmContato(String nmContato) {
        this.nmContato = nmContato;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addEnderecos(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void addTelefones(Telefone telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public String toString() {
        return "Contato{" + "nmContato=" + nmContato + ", enderecos=" + enderecos + ", telefones=" + telefones + '}';
    }
    
    
    
}
