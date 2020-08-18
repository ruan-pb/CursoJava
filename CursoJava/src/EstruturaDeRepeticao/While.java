/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepeticao;

import java.util.Scanner;

public class While {
    public static void main(String args[]){
        
        Scanner leitor = new Scanner (System.in);
        
        int numero = leitor.nextInt();
        int soma  = 0;
        
        while(numero!= 0){
            numero = leitor.nextInt();
            soma+=numero;
            
            
            
            
        }
        System.out.printf("a soma foi: %d%n",soma);
        leitor.close();
        
        
        
    }
    
}
