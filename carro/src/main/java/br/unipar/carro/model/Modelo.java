package br.unipar.carro.model;

public class Modelo {
    
    private int id;
    private String nmModelo;
    private Marca marca;
    private int anoLancto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmModelo() {
        return nmModelo;
    }

    public void setNmModelo(String nmModelo) {
        this.nmModelo = nmModelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAnoLancto() {
        return anoLancto;
    }

    public void setAnoLancto(int anoLancto) {
        this.anoLancto = anoLancto;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", nmModelo=" + nmModelo + ", marca=" + marca + ", anoLancto=" + anoLancto + '}';
    }
    
    
    
}
