/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocadoraDeVeiculos;

import java.util.Date;

/**
 *
 * @author Ruanc
 */
public class AluguelDeCarros {
    
    protected Date saida;
    protected Date chegada;
    
    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelDeCarros(Date saida, Date chegada, Veiculo v) {
        this.saida = saida;
        this.chegada = chegada;
        this.veiculo = v;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
    
    public AluguelDeCarros(){
        
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
