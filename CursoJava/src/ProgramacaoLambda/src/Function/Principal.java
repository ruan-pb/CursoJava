/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) {

        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));
        
      List<String> nomes = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
      //List<String> nomes = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

      nomes.forEach(System.out::println);
    }
}
