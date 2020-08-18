/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) {
        
        
        //predicate = removeIf();
        //consumer = forEach;
        //function = Map

        Scanner leitor = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();
        
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));
        
        
        // ele reconhece o preço e o nome, por que a lista é do tipo Produto
        list.removeIf(x -> x.getPrice()>=100);
        
        
        //Predicate<Produto> pred  = p ->p.getPrice() >=100;
        //list.removeIf(pred);
        
        
        //pode se fazer do jeito abaixo também
        // dentro do comando "metodo" vai esta a condição para remover o elemento 
        //list.removeIf(Produto::metodo);
        
        for(Produto p:list){
            System.out.println("Produtos "+p);
        }

    }

}
