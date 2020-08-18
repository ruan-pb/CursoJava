/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set.DiferencaDoSet.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ruanc
 */
public class DemostracaoHashSet {

    public static void main(String[] args) {
        
        // O Set não aceita repetições
        // hashSet mais rapido, porem ele não diz a Ordem correta
        // treeSet mais lento que o hashSet, mais coloca em ordem alfabetica
        // linkedHashSet um pouco mas lento que o hashSet porem mais rapido que o TreeSet,mant�m a ordem de acordo como os elementos foram adicionados.
        Set<String> listaSet = new HashSet<>();
        listaSet.add("TV");
        listaSet.add("Notebook");
        listaSet.add("Tablet");
        // containes serve pra retorna true or false, vai verificar se o elemento esta contido na lista
        System.out.println(listaSet.contains("Notebook"));
        
        //listaSet.remove("Tablet");
        
        listaSet.add("Celular");
        listaSet.add("Carro Tracker Sonho que vou realizar");
        
        listaSet.removeIf(x -> x.length() >= 3);
        
       // listaSet.removeIf(x ->x.charAt(0)== 'T');
        
        listaSet.removeIf(x -> x.startsWith("Ca"));
        listaSet.removeIf(x -> x.endsWith("ar"));
        
        
        
        for (String p : listaSet) {
            System.out.println(p);
        }

       
    }

    /*copiar(myInt, myObj);
       List<Integer> myInt = Arrays.asList(1, 2, 3, 4);
        List<Double> myDouble = Arrays.asList(3.4, 5.9);
        List<Object> myObj = new ArrayList<>();

    imprimir(myObj);

    copiar(myDouble, myObj);

    imprimir(myObj);

    public static void copiar(List<? extends Number> origem, List<? super Number> destino) {

        for (Number n : origem) {
            destino.add(n);
        }
    }

    public static void imprimir(List<?> lista) {
        for (Object ob : lista) {
            System.out.println(ob);
        }
    }
*/
}
