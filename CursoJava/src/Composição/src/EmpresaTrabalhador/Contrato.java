/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaTrabalhador;

import java.util.Date;

/**
 *
 * @author Ruanc
 */
public class Contrato {
    
    private Date data;
    private double valorPorHora;
    private int horas;

    public Contrato(Date data, double valorPorHora, int horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double totalValor(){
        double total = this.horas*this.valorPorHora;
        return total;
    }
    
    
    
}
