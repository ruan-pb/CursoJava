
package Treinamento_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salario_Funcionario {
    
    public static void main (String args []){
        
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        
        int numero = leitor.nextInt();
        int horas = leitor.nextInt();
        double valor = leitor.nextDouble();
        
        double salario = (double) horas*valor;
        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f%N",salario);
        
        leitor.close();
        
        
    }
    
}
