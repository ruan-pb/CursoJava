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
public class Conta {
    
    private int numero;
    private String suporte;
    protected double saldo;

    public Conta(int numero, String suporte, double saldo) {
        this.numero = numero;
        this.suporte = suporte;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSuporte() {
        return suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double depositar(double valor){
       return this.saldo+=valor;
    }
    public void sacar(double valor){
       this.saldo-=valor + 5;
}
}
