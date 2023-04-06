
package br.unipar.heranca.pessoa.model;

import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public class Aluno extends Pessoa {
    
    private ArrayList<String> cursos;
    private ArrayList<Integer> notas;
    
    public Aluno(){
    }

    public Aluno(ArrayList<String> cursos, ArrayList<Integer> notas, 
            String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }
    
    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    
     
}
