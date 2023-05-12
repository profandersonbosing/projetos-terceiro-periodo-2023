/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula09052023.model;

import br.unipar.aula09052023.model.abstracts.Mamifero;

/**
 *
 * @author andersonbosing
 */
public class Cachorro extends Mamifero {
    
    private String raca;
    private String tamanho;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String amamentar() {
        return "cachorro amamentando";
    }

    @Override
    public String emitirSom() {
        return "AU AU";
    }
    
}
