/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

/**
 *
 * @author Ruanc
 */
public class ProdutoImportado extends Produto{
    private double taxaAlfandegária;

    public ProdutoImportado(String nome, double preco,double taxa) {
        super(nome, preco);
        this.taxaAlfandegária = taxa;
    }

    public double getTaxaAlfandegária() {
        return taxaAlfandegária;
    }

    public void setTaxaAlfandegária(double taxaAlfandegária) {
        this.taxaAlfandegária = taxaAlfandegária;
    }
     @Override
    public String etiquetaDePreco(){
        return this.nome+" R$ "+this.totalpreco()+"(Taxa alfandegária: "+this.taxaAlfandegária +")";
    }
    public double totalpreco(){
        return this.preco+this.taxaAlfandegária;
    }
    
    
    
}
