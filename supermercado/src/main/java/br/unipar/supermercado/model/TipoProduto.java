/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.supermercado.model;

/**
 *
 * @author andersonbosing
 */
public class TipoProduto {
   
    private int cdTpProduto;
    private String dsTipoProduto;

    public TipoProduto() {
    }

    public TipoProduto(int cdTpProduto, String dsTipoProduto) {
        this.cdTpProduto = cdTpProduto;
        this.dsTipoProduto = dsTipoProduto;
    }

    public int getCdTpProduto() {
        return cdTpProduto;
    }

    public void setCdTpProduto(int cdTpProduto) {
        this.cdTpProduto = cdTpProduto;
    }

    public String getDsTipoProduto() {
        return dsTipoProduto;
    }

    public void setDsTipoProduto(String dsTipoProduto) {
        this.dsTipoProduto = dsTipoProduto;
    }

    @Override
    public String toString() {
        return "TipoProduto{" + "cdTpProduto=" + cdTpProduto + ", dsTipoProduto=" + dsTipoProduto + '}';
    }
    
}
