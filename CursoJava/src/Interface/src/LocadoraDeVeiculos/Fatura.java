/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocadoraDeVeiculos;

/**
 *
 * @author Ruanc
 */
public class Fatura {

    private double pagamentoBasico;
    private double taxa;

    public Fatura(double pagamentoBasico, double taxa) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxa = taxa;
    }

    public Fatura() {

    }

    public double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTotalPagamento() {
        return this.getPagamentoBasico() + this.getTaxa();

    }
}
