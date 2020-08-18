/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalConversoDeDolar {
    
    
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor do dolar");
        
        double valorDolar = leitor.nextDouble();
        
        System.out.println("Quanto quer pagar em reais");
        double valorReais = leitor.nextDouble();
        
        double v = ConversoDeDolar.ValorAPagar(valorDolar, valorReais);
        
        
        System.out.printf("Valor a pagar no total %.2f",v);
        
        
        
        
        
        
        
        
        
        
    }
    
}
