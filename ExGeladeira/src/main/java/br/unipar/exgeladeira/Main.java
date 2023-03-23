
package br.unipar.exgeladeira;

import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
        
        Geladeira g = new Geladeira();
        
        String input = JOptionPane.showInputDialog("Deseja ligar ?");
        
        if (input.toUpperCase().equals("SIM")) {
            g.stLigado = true;
        } else {
            g.stLigado = false;
        }
        
        
    }
}
