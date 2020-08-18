/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set.DiferencaDoSet.TreeSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ruanc
 */
public class DemostracaoTreeSet {

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        //união dos elementos
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        
        
        //intersecção pega todos os numeros iguais das duas lista
        //retainAll
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        
        
        //Diferenca remove os numeros que tem diferença entre as duas lista
        // removeAll
        
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}