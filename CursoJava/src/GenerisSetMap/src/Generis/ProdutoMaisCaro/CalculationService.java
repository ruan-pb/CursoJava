/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generis.ProdutoMaisCaro;

import java.util.List;

/**
 *
 * @author Ruanc
 */
public class CalculationService {
    
    
    //isso aqui é um metodo que recebe como paramentro uma lista
    public static <T extends Comparable<T>> T max(List<T> list) {
        //comando isEmpty serve para saber se a lista esta vazia ou não
        if (list.isEmpty()) {

            throw new IllegalStateException("A Lista Não pode ser Vazia");
 }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
 }

        }
         return max;

    }

}
