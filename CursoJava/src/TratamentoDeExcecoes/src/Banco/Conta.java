
package Banco;

/**
 *
 * @author Ruanc
 */
public class Conta {
    
    protected int numero;
    protected String titular;
    protected double saldo;
    protected double saqueLimite;

    public Conta(int numero, String titular, double saldo, double saqueLimite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.saqueLimite = saqueLimite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoLimite() {
        return saqueLimite;
    }

    public void setSaldoLimite(double saldoLimite) {
        this.saqueLimite = saldoLimite;
    }
    
    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor) throws SaqueMaiorQueLimiteException{
        if(valor > this.saqueLimite){
            throw new SaqueMaiorQueLimiteException("O saque é maior que o limite de saque Disponivel");
        }
        if(valor > saldo){
            throw new SaqueMaiorQueSaldo("Saldo Insuficiente");
        }
        this.saldo -= valor;
    }
    
    
    
}
