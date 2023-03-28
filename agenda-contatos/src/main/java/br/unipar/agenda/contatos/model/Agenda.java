/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.agenda.contatos.model;

import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public class Agenda {
    
    private String nmAgenda;
    private ArrayList<Contato> listaContatos;

    public Agenda() {
        this.listaContatos = new ArrayList<>();
    }
    
    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }

    public void addContato(Contato contato) {
        this.listaContatos.add(contato);
    }

    @Override
    public String toString() {
        return "Agenda{" + "nmAgenda=" + nmAgenda + ", listaContatos=" + listaContatos + '}';
    }
    
}
