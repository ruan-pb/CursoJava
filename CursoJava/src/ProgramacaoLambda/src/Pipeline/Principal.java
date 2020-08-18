/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));
        
        // o reduce pega o elemento inicial, e depois pega uma função que recebe dois argumentos e gera o resultado
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);
        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }

}
