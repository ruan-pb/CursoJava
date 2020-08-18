
package POO;

public class Banco {
    private int numeroDaConta;
    private String nome;
    private double saldo;
    
    private static final double TAXA =  5;

    public Banco(int numeroDaConta, String nome, double valorInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        depositar(valorInicial);
    }
    public Banco(){
        
    }
    
    
    

    public Banco(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorInicial() {
        return saldo;
    }

 
    public String toString(){
        return "conta "+this.getNumeroDaConta()+" de nome: "+this.nome+" e o seu saldo é: "+this.getValorInicial();
    }
    public void sacar(double valor){
        this.saldo -=valor + TAXA;
        
    }
    public void depositar(double valor){
        this.saldo +=valor;
        
    }
    
    
    
    
}
