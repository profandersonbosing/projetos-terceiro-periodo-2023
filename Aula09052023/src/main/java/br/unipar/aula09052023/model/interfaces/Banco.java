/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.aula09052023.model.interfaces;

/**
 *
 * @author andersonbosing
 */
public interface Banco {
    
    boolean sacar(double valor);
    boolean depositar(double valor);
    void imprimirExtrato();
    
}
