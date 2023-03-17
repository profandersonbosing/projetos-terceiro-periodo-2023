package br.unipar.exretangulo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        
        Retangulo r = new Retangulo();
        r.setComprimento(4);
        r.setLargura(3);
        //r.calcularArea();
        //r.calcularPerimetro();
        
        JOptionPane.showMessageDialog(null, "A area calculada"
                + " para o retangulo foi :"+r.getArea()+"\n"+
                " O perimetro calculado foi :"+r.getPerimetro());
        
        
    }
}
