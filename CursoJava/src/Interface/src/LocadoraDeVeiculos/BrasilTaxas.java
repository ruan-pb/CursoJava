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
public class BrasilTaxas implements taxaDeServico {
    
    
    public double taxa(double valor){
        if(valor <= 100.00){
            return valor*0.2;
        }
        else{
            return valor*0.15;
        }
    }

    @Override
    public double jurosComposto(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
