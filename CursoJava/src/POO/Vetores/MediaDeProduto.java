
package POO.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaDeProduto {
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor =new Scanner(System.in);
        
        
        int n = leitor.nextInt();
        
        ProdutoDeMediaDeProduto[] vetor = new ProdutoDeMediaDeProduto[n] ;
        
        
        for(int k=0;k<3;k++){
            leitor.nextLine();
            String nome = leitor.nextLine();
            double valor = leitor.nextDouble();
            vetor[k] = new ProdutoDeMediaDeProduto(nome, valor);
        }
        
        double soma = 0.00;
        for(int k=0;k<3;k++){
            soma+= vetor[k].getPreco();
            
            
        }
        double media = soma/n;
        
        System.out.println("resultado: "+media);
        
        leitor.close();
            
            
        
        
        
        
        
        
    }
    
}
