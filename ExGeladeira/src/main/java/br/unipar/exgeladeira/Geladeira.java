package br.unipar.exgeladeira;

import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Geladeira {
    
    String marca;
    int nrPortas;
    String cor;
    double litragem;
    boolean frostFree;
    boolean gelaFacil;
    boolean stLigado;
    
    public void ligarGeladeira(){
        this.stLigado = true;
    }
    
    public void desligarGeladeira(){
        this.stLigado = false;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, 
                "Marca = "+marca+"\n"+
                "nrPortas = "+nrPortas+"\n"+
                "cor = "+cor+"\n"+
                "stLigado = "+stLigado
                );
    }
    
    public String retornarCor(){
        return this.cor;
    }
    
    
}
