/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.heranca.pessoa.model;

/**
 *
 * @author andersonbosing
 */
public class Cachorro extends Animal {
    
    @Override
    public void fazerBarulho(){
        super.fazerBarulho();
        System.out.println("AU AU AU AU AU");
    }
    
}
