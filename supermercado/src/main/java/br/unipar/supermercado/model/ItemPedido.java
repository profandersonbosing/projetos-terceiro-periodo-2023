/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.supermercado.model;

/**
 *
 * @author andersonbosing
 */
public class ItemPedido {
    
    private Item item;
    private int qtdVenda;
    private double vlPrecoUnitario;
    private double vlTotal;

    public ItemPedido() {
    }

    public ItemPedido(Item item, int qtdVenda, double vlPrecoUnitario, double vlTotal) {
        this.item = item;
        this.qtdVenda = qtdVenda;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = vlTotal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
        this.vlTotal = this.vlPrecoUnitario * this.qtdVenda;
    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = this.vlPrecoUnitario * this.qtdVenda;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "item=" + item + ", qtdVenda=" + qtdVenda + ", vlPrecoUnitario=" + vlPrecoUnitario + ", vlTotal=" + vlTotal + '}';
    }
    
    
    
}
