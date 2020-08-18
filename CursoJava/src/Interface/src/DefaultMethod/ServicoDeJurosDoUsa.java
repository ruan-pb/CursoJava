/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethod;

/**
 *
 * @author Ruanc
 */
public class ServicoDeJurosDoUsa implements ServicoDeJuros{
    
    private double taxaDeJuros;
    
    
    
    public ServicoDeJurosDoUsa(double taxa){
        this.taxaDeJuros = taxa;
    }

    @Override
    public double getJuros() {
        return taxaDeJuros;
    }
    
    
}
