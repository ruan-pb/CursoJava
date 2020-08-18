/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepeticao.For;

import java.util.Scanner;



public class Soma {
    public static void main(String args[]){
        Scanner leitor = new Scanner (System.in);
        
        int valor = 0;
        int quantidade = leitor.nextInt();
        
        for(int k=0; k<quantidade;k++){
           int x = leitor.nextInt();
            valor+= x;
            
        }
        System.out.printf("valor %d",valor);
        leitor.close();
    }
    
}
