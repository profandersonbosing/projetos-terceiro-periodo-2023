/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.supermercado.model;

import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public class SuperMercado {
    
    private String nmFantasia;
    private String cnpj;
    private ArrayList<Pedido> listaPedido;

    public SuperMercado() {
        this.listaPedido = new ArrayList<>();
    }

    public SuperMercado(String nmFantasia, String cnpj, ArrayList<Pedido> listaPedido) {
        this.listaPedido = new ArrayList<>();
        this.nmFantasia = nmFantasia;
        this.cnpj = cnpj;
        this.listaPedido = listaPedido;
    }

    public String getNmFantasia() {
        return nmFantasia;
    }

    public void setNmFantasia(String nmFantasia) {
        this.nmFantasia = nmFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    @Override
    public String toString() {
        return "SuperMercado{" + "nmFantasia=" + nmFantasia + ", cnpj=" + cnpj + ", listaPedido=" + listaPedido.toString() + '}';
    }
    
}
