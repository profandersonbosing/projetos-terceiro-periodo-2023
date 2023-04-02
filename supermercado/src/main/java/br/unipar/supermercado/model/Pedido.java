
package br.unipar.supermercado.model;

import java.util.ArrayList;


public class Pedido {
    
    private int nrPedido;
    private Cliente cliente;
    private ArrayList<ItemPedido> listaItens;
    private ArrayList<FormaPagamento> formasPagto;

    public Pedido() {
        this.listaItens = new ArrayList<>();
        this.formasPagto = new ArrayList<>();
    }

    public Pedido(int nrPedido, Cliente cliente, ArrayList<ItemPedido> listaItens, ArrayList<FormaPagamento> formasPagto) {
        this.listaItens = new ArrayList<>();
        this.formasPagto = new ArrayList<>();
        
        this.nrPedido = nrPedido;
        this.cliente = cliente;
        this.listaItens = listaItens;
        this.formasPagto = formasPagto;
    }

    public int getNrPedido() {
        return nrPedido;
    }

    public void setNrPedido(int nrPedido) {
        this.nrPedido = nrPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    public ArrayList<FormaPagamento> getFormasPagto() {
        return formasPagto;
    }

    public void setFormasPagto(ArrayList<FormaPagamento> formasPagto) {
        this.formasPagto = formasPagto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nrPedido=" + nrPedido + ", cliente=" + cliente + ", listaItens=" + listaItens.toString() + ", formasPagto=" + formasPagto + '}';
    }
    
}
