/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula09052023.model;

import br.unipar.aula09052023.model.abstracts.Ave;

/**
 *
 * @author andersonbosing
 */
public class Papagaio extends Ave {

    @Override
    public String voar() {
        return "Papagaio voando";
    }

    @Override
    public String emitirSom() {
        return "RWA RWA";
    }
    
    
    
}
