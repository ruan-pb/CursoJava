/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set.DiferencaDoSet.TreeSet;

import Set.DiferencaDoSet.HashSet.Produto;
import Set.DiferencaDoSet.HashSet.Produto;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]){
        
        
        // para eu usar a estrutura de dados TreeSet é precisa implementar na classe Que for indicada, como por exemplo Produto nesse caso
        // implementar o Comparable e adicionar o metodo CompareTo, e nesse metodo, voce vai informa o que voce quer comparar
        //caso ao contratio vai da erro
        Set<Produto> set = new TreeSet<Produto>();
        
        set.add(new Produto("celular",852.50));
        set.add(new Produto("Notebook",500.00));
        set.add(new Produto("Tablet",100.80));
        
       for(Produto p:set){
           System.out.println(p);
       }
        
        
        
        
        
    }
}
