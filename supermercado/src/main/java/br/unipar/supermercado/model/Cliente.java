package br.unipar.supermercado.model;

public class Cliente {
    
    private String cpf;
    private String nome;
    private String dsEndereco;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String dsEndereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.dsEndereco = dsEndereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", dsEndereco=" + dsEndereco + '}';
    }
    
}
