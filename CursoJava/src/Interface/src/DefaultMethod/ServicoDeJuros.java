/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethod;

import java.security.InvalidParameterException;

/**
 *
 * @author Ruanc
 */
public interface ServicoDeJuros {

    double getJuros();

    default double pagamento(double valor, int meses) {

        if (meses < 1) {

            throw new InvalidParameterException("Months must be greater than zero");

        }

        return valor * Math.pow(1.0 + getJuros() / 100.0, meses);

    }

}
