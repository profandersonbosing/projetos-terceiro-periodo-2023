package br.unipar.bancoturma2.model;

public class Endereco {
    
    private String nmRua;
    private int nrCasa;
    private String nmCidade;
    private String dsComplemento;
    private String cep;
    private String nmBairro;
    
    public Endereco(){
        this.nmRua = "RUA NAO INFORMADA";
        this.nmCidade = "CIDADE NAO INFORMADA";
        this.nmBairro = "BAIRRO NÃO INFORMADO";
    }
    
    public Endereco(String nmRua, int nrCasa, String nmCidade,
            String dsComplemento, String cep, String nmBairro){
        this.cep = cep;
        this.nmRua = nmRua;
        this.nmBairro = nmBairro;
        this.dsComplemento = dsComplemento;
        this.nrCasa = nrCasa;
        this.nmCidade = nmCidade;
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

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nmRua=" + nmRua + ", nrCasa=" + nrCasa + ", nmCidade=" + nmCidade + ", dsComplemento=" + dsComplemento + ", cep=" + cep + ", nmBairro=" + nmBairro + '}';
    }
    
}
