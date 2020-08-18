
package Treinamento_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        
        Scanner leitor = new Scanner(System.in);
        
        double largura;
        double comprimento;
        double valorMetro;
        
        double tamanhoTotal;
        double valorTotal;
        
        Locale.setDefault(Locale.ENGLISH);
        largura = leitor.nextDouble();
        comprimento = leitor.nextDouble();
        valorMetro = leitor.nextDouble();
        
        tamanhoTotal = largura*comprimento;
        valorTotal = tamanhoTotal*valorMetro;
        
        System.out.printf("AREA = %.1f%n ",tamanhoTotal);
        System.out.printf("PREÇO = %.2f%n ",valorTotal);
        
        leitor.close();
        
        
        
    }
    
}
