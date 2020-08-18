
package POO.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class LerNumeroEAltura {
    
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor =new Scanner (System.in);
        
        
        int n  = leitor.nextInt();
        
        double [] vetor =  new double[n];
        
        for(int k=0; k<n; k++){
            
            vetor[k] = leitor.nextDouble();
        }
        
        double soma = 0.0;
        for(int k=0; k<n; k++){
            soma += vetor[k];
        }
        
        double valor = soma/n;
        System.out.println("media de altura de: "+valor);
            
            
        
    }
    
    
}
