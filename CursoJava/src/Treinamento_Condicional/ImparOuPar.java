
package Treinamento_Condicional;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        
        int valor = leitor.nextInt();
        
        if(valor % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
            
        
    }
}
