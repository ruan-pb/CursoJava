
package Treinamento_Sequencial;

import java.util.Scanner;
[]
public class ResultadoDoAlgoritimo {
    public static void main(String args[]){
        
        Scanner leitor = new Scanner (System.in);
        
        int a,b,c,d;
        
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();
        d = leitor.nextInt();
        
        int somaAeB = a * b;
        int somaCeD = c * d;
        int somaTotal = somaAeB - somaCeD;
        
        System.out.printf("Diferença: %d ", somaTotal);
        
        
    }
    
}
