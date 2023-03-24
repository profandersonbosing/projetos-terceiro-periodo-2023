package br.unipar.banco.model;


public class Banco {
    
    private int nrBanco;
    private String nmBanco;
    private Agencia agencia;

    public int getNrBanco() {
        return nrBanco;
    }

    public void setNrBanco(int nrBanco) {
        this.nrBanco = nrBanco;
    }

    public String getNmBanco() {
        return nmBanco;
    }

    public void setNmBanco(String nmBanco) {
        this.nmBanco = nmBanco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Banco{" + "nrBanco=" + nrBanco + ", nmBanco=" + nmBanco + ", agencia=" + agencia + '}';
    }
    
}
