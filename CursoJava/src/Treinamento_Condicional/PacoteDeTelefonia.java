
package Treinamento_Condicional;

import java.util.Locale;]
import java.util.Scanner;

public class PacoteDeTelefonia {
    public static void main (String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        
        int minutos = leitor.nextInt();
        
        double franquia = 50.0;
        
        if(minutos > 100){
            franquia +=  (minutos - 100) *2;
            
        }
        
        System.out.printf("Valor a pagar é de %.2f", franquia);
        
        leitor.close();
            
            
            
        
        
        
        
        
        
        
        
    }
    
}
