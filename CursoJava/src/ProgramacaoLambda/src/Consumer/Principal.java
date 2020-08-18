/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) {

        Locale.setDefault(Locale.US);

        //predicate = removeIf();
        //consumer = forEach;
        //function = map
        
        // não confunda a função Map com map
        //map é uma função que aplica uma função a todos elementos de uma Stream
        
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        list.forEach(c -> c.setPrice(c.getPrice() *1.1));
        
        list.forEach(c -> c.setName(c.getName().toUpperCase()));

        list.forEach(System.out::println);

    }

}
