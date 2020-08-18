/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Ruanc
 */
public class Tercerizado extends Trabalhador {
    
  private double despesaAdicional;

    public Tercerizado(String nome, int horas, double valorHora,double despesaAdicional) {
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public double pagamento(){
        return super.pagamento()+this.despesaAdicional*1.1;
        
        
        
    }
  
  
    
}
