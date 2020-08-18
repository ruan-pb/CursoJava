/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

public class AlgumasFuncoes {
    public static void main(String args[]){
        
        Scanner leitor= new Scanner (System.in);
        
        
        //Calcular a raiz Quadrada de um numero.
        double x = Math.sqrt(25.0);
        System.out.printf("a raiz quadrada de 25 é: ¢.2f%n ", x);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        
        int maior = max(a, b, c);
        
        showResult(maior);
        
        
        
        
    }
    
    public static int max(int a,int b,int c){
        int aux;
        
        if(a>b && a > c){
            aux = a;
        }else if( b> c && b >a){
            aux = b;
        }
        else{
            aux = c;
        }
        return aux;
        
        
        
    }
    public static void showResult(int valor){
        System.out.println("O maior valor foi o numero"+valor);
    }

    
}
