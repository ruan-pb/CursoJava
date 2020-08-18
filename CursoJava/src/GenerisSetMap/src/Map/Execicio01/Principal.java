/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map.Execicio01;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ruanc
 */
public class Principal {
    
    public static void main(String args[]){
        
        // o double precisa ser do mas generico ou seja Double ao invés de double
        
        Map<Produto, Double> stock = new HashMap<>();
        
        //aqui se faz um produto normal, de acordo com que a classe Prodtuo pede no Contrutor
        Produto p1 = new Produto("Telefone", 1.800);
        Produto p2 = new Produto("Tablet", 4.100);
        Produto p3 = new Produto("Notebook", 1.300);
        
        //porem tem como voce adicionar mais informações depois na lista, com a estrutura de lista Map
        // ele permite isso essas mudanças
        
        stock.put(p1, 1.000);
        stock.put(p2, 3.520);
        stock.put(p3, 5.420);
        
        Produto ps = new Produto("Tablet", 4.100);
        
        
        // nesse exemplo só retornou true por que na classe Produto estava implementado o Equals e hashCode
        System.out.println("Contém a chave: "+stock.containsKey(ps));
        
        
    }
    
}
