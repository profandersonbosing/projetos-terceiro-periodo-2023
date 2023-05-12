/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aula11052023;

import br.unipar.aula11052023.enums.MesesEnum;


/**
 *
 * @author andersonbosing
 */
public class Aula11052023 {

    public static void main(String[] args) {
       
        
        MesesEnum.JANEIRO.setNrMes(99);
        System.out.println(MesesEnum.JANEIRO.getNrMes());
        
        System.out.println(MesesEnum.JANEIRO.getDescricao());
        System.out.println(MesesEnum.DEZEMBRO.getNrMes());
        
    }
}
