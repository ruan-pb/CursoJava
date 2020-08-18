/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayPal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ruanc
 */
public class Parcelas {

    protected Date dataDeVencimento;
    protected double quantidade;
    
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Parcelas(Date dataDeVencimento, double quantidade) {
        this.dataDeVencimento = dataDeVencimento;
        this.quantidade = quantidade;

    }

    public Parcelas() {

    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override

    public String toString() {
        return format.format(dataDeVencimento) + " - " + String.format("%.2f", quantidade);


    }

}
