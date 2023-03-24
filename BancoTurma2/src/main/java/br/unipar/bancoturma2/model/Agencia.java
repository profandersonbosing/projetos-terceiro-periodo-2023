package br.unipar.bancoturma2.model;

public class Agencia {
    
    private String nmAgencia;
    private String nrAgencia;
    private Endereco enderecoAgencia;

    public String getNmAgencia() {
        return nmAgencia;
    }

    public void setNmAgencia(String nmAgencia) {
        this.nmAgencia = nmAgencia;
    }

    public String getNrAgencia() {
        return nrAgencia;
    }

    public void setNrAgencia(String nrAgencia) {
        this.nrAgencia = nrAgencia;
    }

    public Endereco getEnderecoAgencia() {
        return enderecoAgencia;
    }

    public void setEnderecoAgencia(Endereco enderecoAgencia) {
        this.enderecoAgencia = enderecoAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "nmAgencia=" + nmAgencia + ", nrAgencia=" + nrAgencia + ", enderecoAgencia=" + enderecoAgencia + '}';
    }
    
}
