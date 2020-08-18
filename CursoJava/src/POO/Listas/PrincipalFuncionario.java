
package POO.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalFuncionario {
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        List<Funcionario> lista = new ArrayList<Funcionario>();
        
        
        System.out.println("quantos participantes");
        int quantidade = leitor.nextInt();
        leitor.nextLine();
        
        for(int k=0;k<quantidade;k++){
            
            System.out.println(" posição # "+k);
            
            System.out.println("id: ");
            int id = leitor.nextInt();
            
            System.out.println("");
            
            
            System.out.println("nome: ");
            String nome = leitor.nextLine();
            
            leitor.nextLine();
            
            System.out.print("salario: ");
            double salario = leitor.nextDouble();
            
            System.out.println("");
            
            Funcionario f = new Funcionario(id, nome, salario);
            
            lista.add(f);
            
            
            
        }
        System.out.println("digite o id do funcionario que vai receber o aumento");
        int idFuncionario = leitor.nextInt();
        System.out.println(" ");
        
        System.out.println("diga a sua porcentagem de aumento");
        double porcentagem = leitor.nextDouble();
        System.out.println("");
        
        System.out.println("Lista");
        
        for(Funcionario f : lista){
            if(idFuncionario == f.getId()){
                double aumento = f.getSalario() * porcentagem /100;
                f.aumentarSalario(aumento);
            }
            
        }
        for(Funcionario f: lista){
            System.out.println(f);
            
        }
        
        
        leitor.close();
    }
    
}
