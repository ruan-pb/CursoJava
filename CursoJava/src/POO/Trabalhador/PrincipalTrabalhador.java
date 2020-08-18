
package POO.Trabalhador;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalTrabalhador {
    public static void main(String args[]){
    	
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        Funcionario f = new Funcionario();
        
        System.out.print("nome");
        f.nome = leitor.nextLine();
        
        System.out.print("salario Bruto");
        f.salarioBruto = leitor.nextDouble();
       
        System.out.print("taxa");
        f.taxa = leitor.nextDouble();
        
        
        
        System.out.println(" ");
        System.out.println("Salario liguido Ã©: "+f);
        System.out.println(" ");
        System.out.println("e o acréscimo no salario de ");
        double aumento = leitor.nextDouble();
        
        f.AumentarSalario(aumento);
        System.out.println(" ");
        System.out.println("salario de: "+f);
        

        
        
        
        
        
        
        
        
        
        
    }
}
