
package POO.ProjetoEstoque;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalEstoque {
    public static void main (String args[]){
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        Produto p = new Produto();
        
        System.out.println("entrada de produtos");
        System.out.println("Nome");
        p.nome = leitor.nextLine();
        System.out.println("preco");
        p.preco = leitor.nextDouble();
        System.out.println("quantidade");
        p.quantidade = leitor.nextInt();
        
        System.out.println(" ");
        System.out.println("produto de saida"+p);
        
        System.out.println("Entrada de produtos");
        int qua = leitor.nextInt();
        p.adcionarProduto(qua);
        
        System.out.println(" ");
        System.out.println(" Atualização " +p);
        
        System.out.println(" ");
        System.out.println(" remover quantos produtos ");
        int quantp = leitor.nextInt();
        p.removerProduto(quantp);
        System.out.println(" Atualização " +p);
        
        
        
        leitor.close();
    }
    
}
