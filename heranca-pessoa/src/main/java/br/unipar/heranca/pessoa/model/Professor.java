
package br.unipar.heranca.pessoa.model;

/**
 *
 * @author andersonbosing
 */
public class Professor extends Pessoa {
   
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor() {
    }

    public Professor(String departamento, String nomeCurso, 
            double salario, String nome, String endereco, 
            String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "departamento=" + departamento + 
                ", nomeCurso=" + nomeCurso + ", salario=" + salario + 
               super.toString() + '}';
    }

    
    
}
