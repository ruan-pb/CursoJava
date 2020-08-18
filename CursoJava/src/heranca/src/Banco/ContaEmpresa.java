/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Ruanc
 */
public class ContaEmpresa extends Conta {
    
    private double limiteMaximo;
    

    public ContaEmpresa(int numero, String suporte, double saldo,double limite) {
        super(numero, suporte, saldo);
        this.limiteMaximo = limite;
    }

    public double getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(double limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }
    public void emprestimo(double valor){
        if(valor <= this.limiteMaximo){
            saldo += valor -10;
            
        }
        
    }
    public void sacar(double valor){
        super.sacar(valor);
        this.saldo -=2;
        
    }
    
}
