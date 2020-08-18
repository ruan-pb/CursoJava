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
public interface ServicoDePagamentoOnline {
    
    public double pagamento(double quantidade);
    public double juros(double quantidade, Integer meses);
    
    
    
}
