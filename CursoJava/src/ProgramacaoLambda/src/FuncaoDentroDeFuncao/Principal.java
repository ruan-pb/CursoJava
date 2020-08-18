/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncaoDentroDeFuncao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class Principal {
    public static void main(String args[]){
        
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));
        
        ServicoProduto sp = new ServicoProduto();
        
        double soma = sp.filtro(list, p -> p.getPrice() <100);
        //double soma = sp.filtro(list, p -> p.getName().charAt(0)=='T');
        
        System.out.println("Soma "+soma);
    }

    
}
