/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula0205.model;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraBonificacao {
    
    public void calcularBonus(Colaborador c) {
        
        if (c instanceof Diretor) {
            
            double vlBonus = c.getSalario() * 1.5;
            
            System.out.println("Bonus Diretor "+vlBonus);
            
            
        } else if (c instanceof Gerente) {
            
            double vlBonus = c.getSalario() * 1.1;
            
            System.out.println("Bonus Gerente "+vlBonus);
            
        } else {
            
            System.out.println("Não tem direito a bonus");
        
        }
        
    }
    
}
