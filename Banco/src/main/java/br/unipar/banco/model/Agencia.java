package br.unipar.banco.model;

public class Agencia {
    
    
    
    private int nrAgencia;
    private String nmAgencia;
    private Conta contaCorrente;

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Conta contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public int getNrAgencia() {
        return nrAgencia;
    }

    public void setNrAgencia(int nrAgencia) {
        this.nrAgencia = nrAgencia;
    }

    public String getNmAgencia() {
        return nmAgencia;
    }

    public void setNmAgencia(String nmAgencia) {
        this.nmAgencia = nmAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "nrAgencia=" + nrAgencia + ", nmAgencia=" + nmAgencia + ", contaCorrente=" + contaCorrente + '}';
    }

}
