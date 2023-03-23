package br.unipar.carro.model;


public class Carro {
 
    private String chassi;
    private String placa;
    private Modelo modelo;
    private Pessoa proprietario;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro{" + "chassi=" + chassi + ", placa=" + placa + ", modelo=" + modelo + ", proprietario=" + proprietario + '}';
    }
    
    
}
