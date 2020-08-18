
package POO;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalBanco {
    public static void main (String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor =new Scanner (System.in);
        
        Banco b;
        
        
        
        System.out.print("Informe o numero da conta");
        int numeroDaConta = leitor.nextInt();
        
        System.out.println("nome do dono da conta");
        leitor.nextLine();
        String nome = leitor.next();
        
        
        
        System.out.println("deseja depositar: s/n");
        
        char desejo = leitor.next().charAt(0);
        System.out.println("");
        
        if(desejo == 's'){
            System.out.println("quanto deseja depositar? ");
            double quantia = leitor.nextDouble();
            b = new Banco(numeroDaConta, nome, quantia);
            
            
            
        }else{
            b = new Banco(numeroDaConta, nome);
            
        }
        
        System.out.println(" ");
        
        
        System.out.println("conta: ");
        System.out.println(b);
        
        System.out.println(" ");
        
        
        System.out.println("Depósito: ");
        double vv = leitor.nextDouble();
        
        b.depositar(vv);
        System.out.println("atualização da conta ");
        System.out.println(b);
        
        
        
        
        System.out.println(" ");
        System.out.print("valor para sacar");
        double ss = leitor.nextDouble();
        b.sacar(vv);
        System.out.println("atualização");
        System.out.println(b);
        
        
        
        
        
        
    }
    
}
