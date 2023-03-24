package br.unipar.bancoturma2.model;


public class Conta {
    
    private String cpfCorrentista;
    private String nrConta;
    private Endereco enderecoEntregaCartao;
    private double vlSaldo;
    private double vlLimite;
    private double vlCredito;
    private String tpConta;

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public void setCpfCorrentista(String cpfCorrentista) {
        this.cpfCorrentista = cpfCorrentista;
    }

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public Endereco getEnderecoEntregaCartao() {
        return enderecoEntregaCartao;
    }

    public void setEnderecoEntregaCartao(Endereco enderecoEntregaCartao) {
        this.enderecoEntregaCartao = enderecoEntregaCartao;
    }

    public double getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(double vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    public double getVlLimite() {
        return vlLimite;
    }

    public void setVlLimite(double vlLimite) {
        this.vlLimite = vlLimite;
    }

    public double getVlCredito() {
        return vlCredito;
    }

    public void setVlCredito(double vlCredito) {
        this.vlCredito = vlCredito;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    @Override
    public String toString() {
        return "Conta{" + "cpfCorrentista=" + cpfCorrentista + ", nrConta=" + nrConta + ", enderecoEntregaCartao=" + enderecoEntregaCartao + ", vlSaldo=" + vlSaldo + ", vlLimite=" + vlLimite + ", vlCredito=" + vlCredito + ", tpConta=" + tpConta + '}';
    }
    
    
}
