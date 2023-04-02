

package br.unipar.supermercado;

import br.unipar.supermercado.model.Cliente;
import br.unipar.supermercado.model.FormaPagamento;
import br.unipar.supermercado.model.Item;
import br.unipar.supermercado.model.ItemPedido;
import br.unipar.supermercado.model.Pedido;
import br.unipar.supermercado.model.SuperMercado;
import br.unipar.supermercado.model.TipoProduto;


public class Main {

    public static void main(String[] args) {
        //Identifique as classes e implemente um programa 
        //para a seguinte especificação: 
        //“O supermercado vende diferentes --tipos de produtos. 
        //Cada --produto tem um preço e uma quantidade em estoque. 
        //Um pedido de um cliente é composto de itens, onde cada 
        //item especifica o produto que o --cliente deseja e a 
        //respectiva quantidade. 
        //--Esse pedido pode ser pago em dinheiro, cheque ou cartão.”
        
        TipoProduto alimenticio = new TipoProduto(1,
                "Produtos Alimenticios");
        TipoProduto higiene = new TipoProduto(2, 
            "Higiene");
        
        Item milho = new Item(1, "Milho do bom", 
                "873618276387621", 2.30, 20, 
                alimenticio);
        
        Item carne = new Item(2, "Picanha", 
                "9789879879789", 50.00, 10, 
                alimenticio);
        
        Item sabonete = new Item(3, "Sabonete dove", 
                "987977899", 1.50, 5,
                higiene);
        
        FormaPagamento dinheiro = new FormaPagamento(1,
                "DINHEIRO");
        
        FormaPagamento pix = new FormaPagamento(2, 
                "PIX");

        Cliente cliente = new Cliente("678688767687", 
                "Anderson", "Rua da faculdade, 787 - Santa Maria");
        
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setNrPedido(123);
        
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setItem(milho);
        itemPedido.setQtdVenda(12);
        itemPedido.setVlPrecoUnitario(milho.getVlPreco());
        
        pedido.getListaItens().add(itemPedido);
        
        ItemPedido itemSabonete = new ItemPedido();
        itemSabonete.setItem(sabonete);
        itemSabonete.setQtdVenda(2);
        itemSabonete.setVlPrecoUnitario(sabonete.getVlPreco());
        
        pedido.getListaItens().add(itemSabonete);     
        
        pedido.getFormasPagto().add(pix);
        pedido.getFormasPagto().add(dinheiro);
        
        SuperMercado mercadinhoDoSeuZe = new SuperMercado();
        mercadinhoDoSeuZe.setCnpj("4324234324234234");
        mercadinhoDoSeuZe.setNmFantasia("Seu ze comercio alimenticio");
        mercadinhoDoSeuZe.getListaPedido().add(pedido);
        
        System.out.println(mercadinhoDoSeuZe.toString());
    }
}
