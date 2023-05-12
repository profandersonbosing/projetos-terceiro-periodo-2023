/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula2704;

/**
 *
 * @author andersonbosing
 */
public class Calculadora {
    
    public double somar(int a, int b){
        return a + b ;
    }
    
    //Alterado somente retorno o que não caracteriza overload
    //public void somar(int a, int b) {
        //return a + b;
    //}
    
    public double somar(int a, int b, int c) {
        return a + b + c;
    }
    
    public double somar(double a, double b, double c) {
        return a + b + c;
    }
    
    public double somar() {
        return 0;
    }
    
    public double somar(double aa, double bb, double cc, double dd) {
        return 0;
    }
    
}
