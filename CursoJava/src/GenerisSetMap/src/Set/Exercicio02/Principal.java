/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set.Exercicio02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]){
        
        Scanner leitor = new Scanner(System.in);
        
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();
        
   
        
        System.out.print("Quantos estudantes do curso A ");
        int quant_A = leitor.nextInt();
        
        for(int k=1;k<=quant_A;k++){
            
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("infome o codigo"));
            
            A.add(codigo);
            
        }
        System.out.print("Quantos estudantes do curso B ");
        int quant_B = leitor.nextInt();
        System.out.println(" ");
        for(int k=1;k<=quant_B;k++){
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("infome o codigo"));
            
            
            B.add(codigo);
            
        }
        System.out.print("Quantos estudantes do curso C ");
        int quant_C = leitor.nextInt();
        System.out.println(" ");
        for(int k=1;k<=quant_C;k++){
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("infome o codigo"));
            C.add(codigo);
    }
        
        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);
        
        System.out.println("total "+total.size());
        
        
        
        
        
        
    }
}
