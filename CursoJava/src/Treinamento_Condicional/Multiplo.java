
package Treinamento_Condicional;

import java.util.Scanner;

public class Multiplo {
    public static void main(String args[]){
        
        Scanner leitor = new Scanner (System.in);
        
        int um = leitor.nextInt();
        int dois = leitor.nextInt();
        
        if(um % dois == 0 || dois % um == 0 ){
            System.out.println("Multiplo");
        }
        else{
            System.out.println("Não multiplo");
        }
        
            
        
    }
    
}
