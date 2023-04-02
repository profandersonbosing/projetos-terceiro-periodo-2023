package br.unipar.supermercado.model;


public class FormaPagamento {
    
    private int cdFormaPagto;
    private String dsFormaPagto;

    public FormaPagamento() {
    }

    public FormaPagamento(int cdFormaPagto, String dsFormaPagto) {
        this.cdFormaPagto = cdFormaPagto;
        this.dsFormaPagto = dsFormaPagto;
    }

    public int getCdFormaPagto() {
        return cdFormaPagto;
    }

    public void setCdFormaPagto(int cdFormaPagto) {
        this.cdFormaPagto = cdFormaPagto;
    }

    public String getDsFormaPagto() {
        return dsFormaPagto;
    }

    public void setDsFormaPagto(String dsFormaPagto) {
        this.dsFormaPagto = dsFormaPagto;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "cdFormaPagto=" + cdFormaPagto + ", dsFormaPagto=" + dsFormaPagto + '}';
    }
    
}
