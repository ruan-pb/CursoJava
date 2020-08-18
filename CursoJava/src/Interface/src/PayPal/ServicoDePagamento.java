/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayPal;

/**
 *
 * @author Ruanc
 */
public class ServicoDePagamento implements ServicoDePagamentoOnline {
    
    public static final double TAXA = 0.02;
    public static final double JUROS_POR_MES = 0.01;

    @Override
    public double pagamento(double quantidade) {
        return quantidade * TAXA;
    }

    @Override
    public double juros(double quantidade, Integer meses) {
        return quantidade * JUROS_POR_MES * meses;
        
        
        
    }
    
    
    
    
}
