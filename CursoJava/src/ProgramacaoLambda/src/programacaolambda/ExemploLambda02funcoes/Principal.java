/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaolambda.ExemploLambda02funcoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class Principal {

    //Isso significa que fun��eses podem, por exemplo, serem passadas como parametros de m�todos
    //bem como retornadas como resultado de m��todos.

    
    // não precisei usar o comparator pois tudo está na classe principal
        public static int compareProducts(Produto p1, Produto p2) {
            return -p1.getPrice().compareTo(p2.getPrice());
        }

        public static void main(String[] args) {
            List<Produto> list = new ArrayList<>();
            list.add(new Produto("TV", 900.00));
            list.add(new Produto("Notebook", 1200.00));
            list.add(new Produto("Tablet", 450.00));
            
            //Informo o nome da classe primeiro acrescento :: que da sintaxe do java: e depois coloco o nome do metodo
            list.sort(Principal::compareProducts);
            
            list.forEach(System.out::println);
        }
    }


