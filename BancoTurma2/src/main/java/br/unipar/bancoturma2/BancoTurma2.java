package br.unipar.bancoturma2;

import br.unipar.bancoturma2.model.Agencia;
import br.unipar.bancoturma2.model.Banco;
import br.unipar.bancoturma2.model.Conta;
import br.unipar.bancoturma2.model.Endereco;
import javax.swing.JOptionPane;


public class BancoTurma2 {

    public static void main(String[] args) {
        
    //Um banco possui muitas agencias e estas agencias 
    //possuem muitos correntistas, sendo contas 
    //correntes ou contas poupanças. Cada correntista possui 
    //um endereço para onde deve ser enviado o cartão.
    
        Endereco enderecoEntrega = new Endereco();
        System.out.println(enderecoEntrega.toString());
        String input = JOptionPane.showInputDialog("Informe o nome da rua:");
        enderecoEntrega.setNmRua(input);
        
        input = JOptionPane.showInputDialog("Informe o Nr da Casa:");
        enderecoEntrega.setNrCasa(Integer.parseInt(input));
        
        input = JOptionPane.showInputDialog("Informe o Complemento:");
        enderecoEntrega.setDsComplemento(input);

        input = JOptionPane.showInputDialog("Informe o Nome da Cidade");
        enderecoEntrega.setNmCidade(input);
        
        input = JOptionPane.showInputDialog("Informe o Cep:");
        enderecoEntrega.setCep(input);
        
        input = JOptionPane.showInputDialog("Informe o nome do bairro:");
        enderecoEntrega.setNmBairro(input);
        
        System.out.println(enderecoEntrega.toString());
        enderecoEntrega.setDsComplemento(
                enderecoEntrega.getDsComplemento() + " ---------- OBS");
        System.out.println(enderecoEntrega.toString());
        
        Conta contaCorrente = new Conta();
        contaCorrente.setCpfCorrentista("111111111111");
        contaCorrente.setEnderecoEntregaCartao(enderecoEntrega);
        contaCorrente.setNrConta("199493-X");
        contaCorrente.setTpConta("CONTA_CORRENTE");
        contaCorrente.setVlCredito(500);
        contaCorrente.setVlLimite(0);
        contaCorrente.setVlSaldo(1000);
        
        Endereco enderecoAgencia = new Endereco("Avenida Parigot de souza",
                111, "Cascavel", "Rua Esburacada", 
                "90909090", "Centro");
        
        Agencia agenciaBancoBrasil = new Agencia();
        agenciaBancoBrasil.setNrAgencia("3213-1");
        agenciaBancoBrasil.setNmAgencia("Agencia do Lago");
        agenciaBancoBrasil.setEnderecoAgencia(enderecoAgencia);
        
        Banco bancoBB = new Banco();
        bancoBB.setAgencia(agenciaBancoBrasil);
        bancoBB.setNmBanco("Banco do Brasil");
        bancoBB.setNrBanco("1221-0");
        
        System.out.println(bancoBB.toString());
        
    }
}
