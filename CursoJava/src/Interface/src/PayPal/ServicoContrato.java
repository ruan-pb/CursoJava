/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayPal;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ruanc
 */
public class ServicoContrato {
    
    protected ServicoDePagamentoOnline servicoDePagamento;

    public ServicoContrato(ServicoDePagamentoOnline servicoDePagamento) {
        this.servicoDePagamento = servicoDePagamento;
    }
    
    
    
    
    
    public void ProcessamentoDeContrato(Contrato contrato, int meses){
        double parcelaBasica = contrato.valorTotal /meses;
        double valorTotal =0;
        
        for(int k=1; k<= meses;k++){
            Date data = adicionarMes(contrato.getData(),k);
            double atualizarParcela = parcelaBasica + servicoDePagamento.juros(parcelaBasica,k);
            double valorFinal = atualizarParcela +  servicoDePagamento.pagamento(atualizarParcela);
            valorTotal +=valorFinal;
            
            contrato.adicionarParcela(new Parcelas(data, valorFinal));
            
           
            
        }
        System.out.println(valorTotal);
    }
    
    public Date adicionarMes(Date data, int n){
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
        
    }
    
}
