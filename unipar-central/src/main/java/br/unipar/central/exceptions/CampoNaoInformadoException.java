/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.exceptions;

/**
 *
 * @author andersonbosing
 */
public class CampoNaoInformadoException extends Exception {
    
    public CampoNaoInformadoException(String campo) {
        super("O campo "+ campo + " Não Foi Informado. Verique!");
    }
    
}
