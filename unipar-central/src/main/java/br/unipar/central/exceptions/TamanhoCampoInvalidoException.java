/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.exceptions;

/**
 *
 * @author andersonbosing
 */
public class TamanhoCampoInvalidoException extends Exception {
    
    public TamanhoCampoInvalidoException(String campo, int tamanho) {
        super("O campo "+campo+" foi informado com tamanho("+tamanho+" caracteres)"
                + "invalido. Verifique!");
    }
    
}
