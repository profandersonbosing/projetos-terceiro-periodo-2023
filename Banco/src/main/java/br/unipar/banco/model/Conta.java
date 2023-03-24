package br.unipar.banco.model;

public class Conta {
    
    private int nrConta;
    private Endereco endereco;
    private String cpfCorrentista;
    private String tpConta;

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public void setCpfCorrentista(String cpfCorrentista) {
        this.cpfCorrentista = cpfCorrentista;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    @Override
    public String toString() {
        return "Conta{" + "nrConta=" + nrConta + ", endereco=" + endereco + ", cpfCorrentista=" + cpfCorrentista + ", tpConta=" + tpConta + '}';
    }

}
