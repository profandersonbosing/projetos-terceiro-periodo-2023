package br.unipar.carro.model;

public class Endereco {
    
    private String cep;
    private String nmRua;
    private int nrCasa;
    private String dsComplemento;
    private String sgUf;
    private String nmCidade;
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", nmRua=" + nmRua + ", nrCasa=" + nrCasa + ", dsComplemento=" + dsComplemento + ", sgUf=" + sgUf + ", nmCidade=" + nmCidade + '}';
    }
    
}
