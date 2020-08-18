/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generis.Coringa;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class tipoCoringas {

        //Com Tipos Coringa podemos se fazer m�todos que recebam um generico qualquer tipo
        //porem n�o são capazes de adicionar elementos
    //alias pode-se adicionar, mas tem quem que ser super a alguma classe
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    
    //O metodo abaixa imprimi todos os tipos, seja String, Integer, Double
    // o generis pode se adicionar, a diferen�a a� que o generis pode adicionar elementos na sua classe mae, por�m fica refem
    // da intanciação na classe principal, coisa que o coringa faz sem precisar ser informado.     <?> Coringa     <T>Generis
    //coringa muito usado para imprimir elementos
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }

    }
}
