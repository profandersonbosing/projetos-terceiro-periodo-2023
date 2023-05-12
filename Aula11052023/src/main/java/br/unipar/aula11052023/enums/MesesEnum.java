/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unipar.aula11052023.enums;

/**
 *
 * @author andersonbosing
 */
public enum MesesEnum {
    
    JANEIRO("Janeiro", 1), 
    FEVEREIRO("Fevereiro", 2), 
    MARCO("Março", 3), 
    ABRIL("Abril", 4), 
    MAIO("Maio", 5), 
    JUNHO("Junho", 6), 
    JULHO("Julho", 7),
    AGOSTO("Agosto", 8), 
    SETEMBRO("Setembro", 9), 
    OUTUBRO("Outubro", 10), 
    NOVEMBRO("Novembro", 11), 
    DEZEMBRO("Dezembro", 12);
    
    private String descricao;
    private int nrMes;
    
    private MesesEnum(String descricao, int nrMes){
        this.descricao = descricao;
        this.nrMes = nrMes;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public int getNrMes(){
        return this.nrMes;
    }
    
    public void setNrMes(int nrMes) {
        this.nrMes = nrMes;
    }
    
}
