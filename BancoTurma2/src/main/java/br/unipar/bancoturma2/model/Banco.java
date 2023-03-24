
package br.unipar.bancoturma2.model;

public class Banco {
    
    private String nrBanco;
    private String nmBanco;
    private Agencia agencia;

    public String getNrBanco() {
        return nrBanco;
    }

    public void setNrBanco(String nrBanco) {
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
