
package POO.Trabalhador;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;
    
    
    
    
    public double SalarioComdescontaDaTaxa(){
        return this.salarioBruto - this.taxa;
      
     
        
    }
    public void AumentarSalario(double p){
        
        salarioBruto += salarioBruto* p/100.00;
        
        
    }
    public String toString(){
        return nome +", $ "+String.format("%.2f",SalarioComdescontaDaTaxa() );
    }
    
}
