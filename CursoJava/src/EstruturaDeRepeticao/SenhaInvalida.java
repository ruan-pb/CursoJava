/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeRepeticao;

import java.util.Scanner;

public class SenhaInvalida {
    public static void main(String args[]){
        Scanner leitor = new Scanner (System.in);
        
        int senha = leitor.nextInt();
        
        String senhaValida = "senha Válida";
        
        while(senha != 2002){
            System.out.println("senha Invalida ");
            senha = leitor.nextInt();
        }
        
        System.out.println(senhaValida);
    }
    
}
