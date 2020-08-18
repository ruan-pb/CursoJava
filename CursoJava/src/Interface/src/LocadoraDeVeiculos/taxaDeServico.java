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
public interface taxaDeServico {

    public double taxa(double pagamentoBasico);
    public double jurosComposto(double valor);
    
}
