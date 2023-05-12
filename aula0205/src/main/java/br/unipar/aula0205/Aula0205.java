/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aula0205;

import br.unipar.aula0205.model.CalculadoraBonificacao;
import br.unipar.aula0205.model.Diretor;
import br.unipar.aula0205.model.Gerente;


/**
 *
 * @author andersonbosing
 */
public class Aula0205 {

    public static void main(String[] args) {
        //Criaremos a Classe Funcionário, Diretor, Gerente e Colaborador.
        //Além de uma classe para calcular o valor de bonificação de cada uma 
        //dessas pessoas.
        
        Diretor d = new Diretor();
        d.setCargo("Diretor de TI");
        d.setSalario(10000);

        Gerente g = new Gerente();
        g.setSalario(5000);
        
        CalculadoraBonificacao calc = new CalculadoraBonificacao();
        calc.calcularBonus(d);
        
        calc.calcularBonus(g);

        
    }
}
