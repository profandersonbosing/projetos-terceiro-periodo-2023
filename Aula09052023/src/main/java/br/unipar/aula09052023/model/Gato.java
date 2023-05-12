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
public class Gato extends Mamifero {
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        return "gatinho amamentando";
    }

    @Override
    public String emitirSom() {
        return "miau miau";
    }
    
}
