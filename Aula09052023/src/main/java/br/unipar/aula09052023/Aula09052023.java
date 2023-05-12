package br.unipar.aula09052023;

import br.unipar.aula09052023.model.Cachorro;
import br.unipar.aula09052023.model.Gato;
import br.unipar.aula09052023.model.Papagaio;

public class Aula09052023 {

    public static void main(String[] args) {
        
        Papagaio p = new Papagaio();
        System.out.println(p.voar());
        
        Cachorro c = new Cachorro();
        System.out.println(c.emitirSom());  
        
        Gato g = new Gato();
        System.out.println(g.emitirSom());
        
    }
}
