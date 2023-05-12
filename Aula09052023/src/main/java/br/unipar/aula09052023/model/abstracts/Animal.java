package br.unipar.aula09052023.model.abstracts;

public abstract class Animal {
    
    private String nome;
    
    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
