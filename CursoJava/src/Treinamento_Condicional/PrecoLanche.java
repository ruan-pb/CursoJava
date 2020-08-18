
package Treinamento_Condicional;

import java.util.Scanner;

public class PrecoLanche {
    public static void main (String args[]){
        
        Scanner leitor = new Scanner(System.in);
        
        double CachorroQuente = 4.00;
        double XSalada = 4.50;
        double xBacon = 5.00;
        double TorradaSimples = 2.00;
        double refrigerante = 1.50;
        
        
        int pedida = leitor.nextInt();
        int quantidade = leitor.nextInt();
        double total;
        
        
        if(pedida == 1){
            total = (double) CachorroQuente * quantidade;
        }
        else if(pedida == 2){
            total = (double) XSalada *quantidade;
        }
        else if(pedida == 3){
            total = (double) xBacon * quantidade;
        }
        else if(pedida == 4){
            total = (double) TorradaSimples * quantidade;
        }
        else{
            total = (double) refrigerante*quantidade;
        }
        System.out.printf(" Total: %.2f",total);
    }   
    
    
}
