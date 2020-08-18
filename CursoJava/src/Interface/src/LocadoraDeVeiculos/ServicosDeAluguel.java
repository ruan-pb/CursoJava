/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocadoraDeVeiculos;

import java.io.File;

/**
 *
 * @author Ruanc
 */
public class ServicosDeAluguel {
    
    private double precoPorDia;
    private double precoPorHora;
    
    private taxaDeServico taxasDeServico;

    public ServicosDeAluguel(double precoPorDia, double precoPorHora, taxaDeServico taxasDeServico) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxasDeServico = taxasDeServico;
    }
    
    public ServicosDeAluguel(){
        
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public taxaDeServico getTaxasDeServico() {
        return taxasDeServico;
    }

    public void setTaxasDeServico(taxaDeServico taxasDeServico) {
        this.taxasDeServico = taxasDeServico;
    }
    public void processamentoDeFatura(AluguelDeCarros ac){
        long tempo1 = ac.saida.getTime();
        long tempo2 = ac.chegada.getTime();
        
        double horas = (double)(tempo2 - tempo1) /1000 /60 /60;
        
        double pagamentoBasico;
        if(horas <= 12){
            
            //Math.ceil serve para aredondar o valor para cima
            pagamentoBasico = Math.ceil(horas) * this.precoPorHora;
        }
        else{
            pagamentoBasico = Math.ceil(horas/24)*this.precoPorDia;
        }
        
        double taxa = this.taxasDeServico.taxa(pagamentoBasico);
        
        //boolean certo = new File("c:\\Users\\Ruanc\\Documentos").mkdir();
        
        Fatura t = new Fatura(pagamentoBasico, taxa);
        
        ac.setFatura(t);
        
    }
    
}
