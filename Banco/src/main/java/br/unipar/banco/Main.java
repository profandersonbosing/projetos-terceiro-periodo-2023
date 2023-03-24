package br.unipar.banco;

import br.unipar.banco.model.Agencia;
import br.unipar.banco.model.Banco;
import br.unipar.banco.model.Conta;
import br.unipar.banco.model.Endereco;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //        Um banco possui muitas agencias e estas agencias 
        //        possuem muitos correntistas, sendo contas 
        //        correntes ou contas poupanças. 
        //        Cada correntista possui um endereço 
        //        para onde deve ser enviado o cartão.
        Endereco endereco = new Endereco("RUA SEM SAIDA", 
                "lalalala", 1, "TOLEDO", "PR");
        Endereco endereco1 = new Endereco();
        
        System.out.println(endereco);
 
        String input = JOptionPane.showInputDialog("Informe o nome da Rua?");       
        endereco.setNmRua(input);
        
        input = JOptionPane.showInputDialog("Digite o Complemento do Endereco?");
        endereco.setDsComplemento(input);
        
        input = JOptionPane.showInputDialog("Informe o nome da Cidade?");
        endereco.setNmCidade(input);
        
        input = JOptionPane.showInputDialog("Informe o numero da casa?");
        endereco.setNrCasa(Integer.parseInt(input));
        
        input = JOptionPane.showInputDialog("Informe a Sigla da UF ?");
        endereco.setSgUf(input);
        
        Conta conta = new Conta();
        conta.setCpfCorrentista("11111111111");
        conta.setEndereco(endereco);
        conta.setNrConta(423423);
        conta.setTpConta("CONTA_CORRENTE");
        conta.setTpConta(conta.getTpConta() + " OBS");
        
        Agencia agencia = new Agencia();
        agencia.setContaCorrente(conta);
        agencia.setNmAgencia("Agencia do Lago");
        agencia.setNrAgencia(587465837);
        
        Banco banco = new Banco();
        banco.setAgencia(agencia);
        banco.setNmBanco("Banco Itau");
        banco.setNrBanco(9999);
        
        System.out.println(banco.toString());
        

    }
}
