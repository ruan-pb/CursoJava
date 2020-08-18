
package Treinamento_Condicional;

import java.util.Scanner;


public class PositivoOuNegativo {
    
    public static void main(String args[]){
        Scanner leitor= new Scanner(System.in);
        
        
        int valor = leitor.nextInt();
        
        if(valor >= 0){
            System.out.println("Não negativo");
        }
        else{
            System.out.println("Negativo");
        }
        
        
        
        
    }
    
    
}
