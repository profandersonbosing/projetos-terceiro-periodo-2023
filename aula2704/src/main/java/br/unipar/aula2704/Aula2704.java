/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aula2704;

/**
 *
 * @author andersonbosing
 */
public class Aula2704 {

    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo();
        acelerarVeiculo(veiculo);
        
        Carro c = new Carro();
        acelerarVeiculo(c);
        
        Veiculo novoVeiculo = new Moto();
        acelerarVeiculo(novoVeiculo);
        
        
    }
    
    public static void acelerarVeiculo(Veiculo v){
        
        if (v instanceof Moto) {
            System.out.println("é uma moto");
            v.acelerar();
        }
        
        
    }
    
}
