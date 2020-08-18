/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ruanc
 */
public class ProdutoUsado extends Produto {
    private Date dataDaCompra;
    
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(String nome, double preco,Date data) {
        super(nome, preco);
        this.dataDaCompra = data;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }
    @Override
    public String etiquetaDePreco(){
        return this.nome+" (USADO) R$ "+this.preco+" Data de Compra:( "+format.format(this.dataDaCompra)+")";
    }
    
}
