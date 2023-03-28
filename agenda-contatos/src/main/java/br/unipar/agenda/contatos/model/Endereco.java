
package br.unipar.agenda.contatos.model;

public class Endereco {
    
    private String nmRua;
    private String dsComplemento;
    private int nrCasa;
    private String nmCidade;
    private String sgUf;
    
    public Endereco() {
    }
    
    public Endereco(String nmRua, String dsComplemento, int nrCasa,
            String nmCidade, String sgUf){
        this.nmRua = nmRua;
        this.dsComplemento = dsComplemento;
        this.nrCasa = nrCasa;
        this.nmCidade = nmCidade;
        this.sgUf = sgUf;
    }
    
    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
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

    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nmRua=" + nmRua + ", dsComplemento=" + dsComplemento + ", nrCasa=" + nrCasa + ", nmCidade=" + nmCidade + ", sgUf=" + sgUf + '}';
    }
    
}
