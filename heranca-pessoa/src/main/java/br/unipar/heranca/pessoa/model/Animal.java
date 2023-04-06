/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.heranca.pessoa.model;

/**
 *
 * @author andersonbosing
 */
public class Animal {
    
    private int id;
    private String nome;
    private String sexo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void fazerBarulho(){
        System.out.println("BARULHO DO ANIMAL");
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + '}';
    }
    
    
    
}
