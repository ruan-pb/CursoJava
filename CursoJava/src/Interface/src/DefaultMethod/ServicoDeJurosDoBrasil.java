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
public class ServicoDeJurosDoBrasil implements ServicoDeJuros {

    private double juros;

    public ServicoDeJurosDoBrasil(double taxaDeJuros) {

        this.juros = taxaDeJuros;

    }


    @Override
    public double getJuros() {
        return juros;
    }

}
