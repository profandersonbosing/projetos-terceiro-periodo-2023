/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula09052023.model;

import br.unipar.aula09052023.model.interfaces.Banco;


/**
 *
 * @author andersonbosing
 */
public class NuBank implements Banco {

    @Override
    public boolean sacar(double valor) {
        System.out.println("Sacado: "+valor);
        return true;
    }

    @Override
    public boolean depositar(double valor) {
        System.out.println("Depositado: "+valor);
        return true;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimindo extrato do nubank");
    }
    
}
