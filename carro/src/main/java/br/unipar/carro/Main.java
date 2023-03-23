package br.unipar.carro;

import br.unipar.carro.model.Carro;
import br.unipar.carro.model.Endereco;
import br.unipar.carro.model.Marca;
import br.unipar.carro.model.Modelo;
import br.unipar.carro.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        //        Se nós temos uma classe que representa um carro, 
        //        esse carro tem uma marca que tem seus próprios atributos. 
        //        E essa marca consequentemente pode possuir um endereço que 
        //        também possui seus próprios atributos.
        Endereco enderecoFabrica = new Endereco();
        enderecoFabrica.setCep("99999999");
        enderecoFabrica.setDsComplemento("Rua sem saida");
        enderecoFabrica.setNmCidade("São Paulo");
        enderecoFabrica.setNmRua("Avenida Parigot de Souza");
        enderecoFabrica.setNrCasa(666);
        enderecoFabrica.setSgUf("SP");

        Marca marca = new Marca();
        marca.setCnpj("75.977.845/0001-30");
        marca.setEndereco(enderecoFabrica);
        marca.setInscEstadual("24324234234234");
        marca.setLogo("http://adufhiugdisgaidgiasygdigysa");
        marca.setNmMarca("Chevrolet");
        
        Modelo modelo = new Modelo();
        modelo.setAnoLancto(2022);
        modelo.setId(1);
        modelo.setMarca(marca);
        modelo.setNmModelo("Monza");
        
        Endereco enderecoProprietario = new Endereco();
        enderecoProprietario.setCep("78678768678");
        enderecoProprietario.setDsComplemento("lalalalala");
        enderecoProprietario.setNmCidade("Toledo");
        enderecoProprietario.setNmRua("Rua das flores");
        enderecoProprietario.setNrCasa(99);
        enderecoProprietario.setSgUf("PR");
        
        Pessoa proprietario = new Pessoa();
        proprietario.setCpf("821987379912873987");
        proprietario.setEndereco(enderecoProprietario);
        proprietario.setNmPessoa("Anderson");
        
        Carro carro = new Carro();
        carro.setChassi("776876867");
        carro.setModelo(modelo);
        carro.setPlaca("AAAA-23232");
        carro.setProprietario(proprietario);
        
        System.out.println(carro.toString());

    }
}
