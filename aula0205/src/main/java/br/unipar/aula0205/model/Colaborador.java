package br.unipar.aula0205.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author andersonbosing
 */
//@Getter
//@Setter
//@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Colaborador {
    
    private int nrRegistro;
    private String nome;
    private Date dtAdmissao;
    private int nrCracha;
    private double salario;
    
}
