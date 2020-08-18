/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generis.Coringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class CoringaDelimitado {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        
        List<Object> myObjs = new ArrayList<Object>();
        
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    //como se le: de qualquer tipo que extend da classe Number:  para     qualquer classe acima de number ou number 
    // a lista de Origem não pode adicionar, apenas acessar
    // a lista de Destino não pode acessar apenas adicionar
    //porque fazer isso? o metodo vai receber qualquer lista do tipo de number e vai copiar para qualquer classe acima de number
    //como por exemplo a classe Object que é acima de Number, aplicando assim o UPCasting
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }
    // passo como parametro uma lista qualquer
    public static void printList(List<?> list) {
        //botou o Object porque pode receber qualquer tipo de lista
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}





































