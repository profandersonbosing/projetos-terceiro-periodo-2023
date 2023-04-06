
package br.unipar.heranca.pessoa;

import br.unipar.heranca.pessoa.model.Cachorro;
import br.unipar.heranca.pessoa.model.Pato;
import br.unipar.heranca.pessoa.model.Professor;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setCpf("029302930920393203");
        professor.setDepartamento("ENGENHARIAS E AFINS");
        professor.setEndereco("Rua bla bla bla");
        professor.setNome("Anderson");
        professor.setNomeCurso("ADS");
        professor.setSalario(2.0);
        professor.setTelefone("434343434343");
        
        System.out.println(professor.toString());
        
        
        Pato pato = new Pato();
        pato.fazerBarulho();
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        
    }
}
