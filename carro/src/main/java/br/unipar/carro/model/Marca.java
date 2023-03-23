package br.unipar.carro.model;

public class Marca {
    
    private String cnpj;
    private String nmMarca;
    private String inscEstadual;
    private String logo;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNmMarca() {
        return nmMarca;
    }

    public void setNmMarca(String nmMarca) {
        this.nmMarca = nmMarca;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Marca{" + "cnpj=" + cnpj + ", nmMarca=" + nmMarca + ", inscEstadual=" + inscEstadual + ", logo=" + logo + ", endereco=" + endereco + '}';
    }
    
    
}
