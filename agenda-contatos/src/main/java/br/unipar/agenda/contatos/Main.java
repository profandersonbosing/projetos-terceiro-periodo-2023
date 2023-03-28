package br.unipar.agenda.contatos;

import br.unipar.agenda.contatos.model.Agenda;
import br.unipar.agenda.contatos.model.Contato;
import br.unipar.agenda.contatos.model.Endereco;
import br.unipar.agenda.contatos.model.Telefone;


public class Main {

    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        
        
        Contato c = new Contato();
        c.setNmContato("Anderson");
        
        Endereco endereco = new Endereco();
        endereco.setDsComplemento("Sem saida");
        endereco.setNmCidade("toledo");
        c.addEnderecos(endereco);
        
        Telefone telefone = new Telefone();
        telefone.setId(1);
        telefone.setNrDdd(45);
        telefone.setNrTelefone("5345345345");
        telefone.setTipoTelefone("Residencial");
        
        c.addTelefones(telefone);
        
        agenda.addContato(c);
        
        System.out.println(c.toString());
        
    }
}
