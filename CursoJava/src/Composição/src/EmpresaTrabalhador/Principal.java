/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]) throws ParseException{
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Entre com o Departamento: ");
        String departamento = leitor.nextLine();
        
        System.out.print("Entre Com os Dados");
        
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.print("Nivel ");
        String nivel = leitor.nextLine().toUpperCase();
                
         System.out.print("Salario ");
         double salario = leitor.nextDouble();
         
         Departamento d = new Departamento(departamento);
         
         Trabalhador t = new Trabalhador(nome, Nivel.valueOf(nivel), salario, d);
         
         System.out.print("Quantos Contratos: ");
         int quantidade = leitor.nextInt();
         
         for(int k=1; k<= quantidade; k++){
             System.out.print("Contrato "+ k);
             
             System.out.print("Data: ");
             Date data = format.parse(leitor.next());
             
             System.out.print("Valor por hora: ");
             double valorHora = leitor.nextDouble();
             
             System.out.println("Quantidade de horas: ");
             int quantidadeDeHoras = leitor.nextInt();
             
             Contrato contrato = new Contrato(data, valorHora, quantidadeDeHoras);
             
             t.adicionarContrato(contrato);
             
           
             
             
         }
         System.out.println("");
         System.out.print("Entre com o mes e ano MM/YYYY: ");
         String mesEAno = leitor.next();
         
         int mes = Integer.parseInt(mesEAno.substring(0,2));
         int ano = Integer.parseInt(mesEAno.substring(3));
         
         System.out.println("Nome: "+t.getNome());
         System.out.println("Departamento: "+t.getDp().getNome());
         System.out.println("Salario ganho no mes: "+mesEAno+"Foi de: " +String.format("%.2f",t.salario(mes, ano)));
         
         
         
             
           leitor.close();
         
        
        
        
    }
    
}
