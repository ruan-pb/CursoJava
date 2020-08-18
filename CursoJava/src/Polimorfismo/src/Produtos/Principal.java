/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]) throws ParseException{
        
        Scanner leitor = new Scanner (System.in);
        
        Locale.setDefault(Locale.US);
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        ArrayList<Produto> lista = new ArrayList<>();
        
        System.out.print("Quantidade De produtos: ");
        int quantidade =  leitor.nextInt();
        
        for(int k=1; k<=quantidade; k++){
            System.out.print("Produto Importado ( I ) Produto Novo ( N ) produto Usado ( U )");
            char tipo = leitor.next().toUpperCase().charAt(0);
            
            if(tipo == 'I'){
                System.out.print("Nome do Produto: ");
                leitor.nextLine();
                String nome = leitor.nextLine();
                
                System.out.print("Preço ");
                double preco = leitor.nextDouble();
                
                System.out.print("Taxa de Alfandega ");
                double taxa = leitor.nextDouble();
                leitor.nextLine();
                
                Produto produtoImportado = new ProdutoImportado(nome, preco, taxa);
                
                lista.add(produtoImportado);
                
                
            }
            else if (tipo == 'N'){
                System.out.print("Nome do Produto: ");
                leitor.nextLine();
                String nome = leitor.nextLine();
                
                System.out.print("Preço ");
                double preco = leitor.nextDouble();
                
                Produto produtoNovo = new Produto(nome, preco);
                
                lista.add(produtoNovo);
            }
            else if(tipo == 'U'){
                System.out.print("Nome do Produto: ");
                leitor.nextLine();
                String nome = leitor.nextLine();
                
                System.out.print("Preço ");
                double preco = leitor.nextDouble();
                
                System.out.print("Data De fabricação: ");
                Date data = format.parse(leitor.next());
                
                Produto ProdutoUsado = new ProdutoUsado(nome, preco, data);
                
                lista.add(ProdutoUsado);
            }
            else{
                System.out.println("Forma Inválida");
            }
            
            
        
    }
        
     
        System.out.println("Etiquetas: ");
        for(Produto p :lista){
            System.out.println(p.etiquetaDePreco());
            
        }
        
        
    }
    
}
