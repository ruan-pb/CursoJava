/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracrFormas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {
    public static void main(String args[]){
        
        Scanner leitor = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);
        
        ArrayList<Forma> lista = new ArrayList<>();
        
        System.out.print("Quantas formas: ");
        int quantidade = leitor.nextInt();
        
        for(int k=1;k<=quantidade;k++){
            System.out.print("forma: "+k);
            
            System.out.print("Retangulo ( R ) ou Circulo ( C )");
            char tipo = leitor.next().toLowerCase().charAt(0);
            
            System.out.print("Cor /PRETO / VERMELHO / AZUL ");
            Cor cor = Cor.valueOf(leitor.next().toUpperCase());
            
            if(tipo == 'r'){
                System.out.println("Altura: ");
                double altura = leitor.nextDouble();
                
                System.out.println("largura: ");
                double largura = leitor.nextDouble();
                
                Forma retangulo = new Retangulo(altura, largura, cor);
                lista.add(retangulo);
            }
            else if(tipo == 'c'){
                System.out.println("Raio: ");
                double raio = leitor.nextDouble();
                
                Forma circulo = new Circulo(raio, cor);
                
                lista.add(circulo);
            }else{
                System.out.println("Opção Inválida ");
            }
        
    }
        System.out.println("");
        System.out.println("Formas");
        
        for(Forma f:lista){
            System.out.println(f.cor+" - "+String.format("%.2f",f.area()));
        }
        
    }
    
}
