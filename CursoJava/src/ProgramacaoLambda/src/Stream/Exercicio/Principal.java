/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream.Exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Infome o caminho");
        String caminho = leitor.nextLine();
        
        
        try(BufferedReader bf = new BufferedReader(new FileReader(caminho))){
            List<Trabalhador> lista = new ArrayList<>();
            
            String linha = bf.readLine();
            
            while(linha != null){
                
                String [] vetor = linha.split(",");
                lista.add(new Trabalhador(vetor[0], vetor[1], Double.parseDouble(vetor[2])));
                
                linha = bf.readLine();
              
            }
            System.out.println("Entre com um valor ");
            double valor = leitor.nextDouble();
            
            //stream para tranforma uma lista e uma sequencia
            // filter serve para pegar um elemento da stream e fazer uma comparação igual ao do "IF"
            // o map serve para dizer o qua a variavel "soma" teria q retorna
            // o sorted serve para organizar em ordema alfabetica
            // o collect(Collectors.toList()) serve pra fazer a stream virar uma lista novamente
            List<String> emails = lista.stream().filter(x -> x.salario > valor).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
            
            System.out.println("email de pessoas acima do valor "+String.format("%.2f",valor));
            
            emails.forEach(System.out::println);
            
            System.out.println("informe a letra que vc deseja saber o nome");
            
            char letra = leitor.next().toUpperCase().charAt(0);
            
            
            //stream para tranforma uma lista e uma sequencia
            // filter serve para pegar um elemento da stream e fazer uma comparação igual ao do "IF"
            // o map serve para dizer o qua a variavel "soma" teria q retorna
            // o reduce faz o calculo do que se foi pedido
            double soma = lista.stream().filter(x -> x.getNome().charAt(0)== letra).map(x -> x.salario).reduce(0.0 ,(x,y) -> x + y );
            
            System.out.println("Salario de pessoas começadas com M são "+String.format("%.2f",soma));
            
            
            
            
            
            
        }
        catch(IOException e){
            System.out.println("Erro "+e.getMessage());
        }
        
    }
    
}
