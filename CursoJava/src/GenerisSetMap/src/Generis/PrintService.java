package Generis;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruanc
 */
public class PrintService<T> {
    
    //recebe qualquer tipo de lista, String,Double,int...
    private List<T> lista = new ArrayList<>();

    public void addValue(T valor) {
        lista.add(valor);
    }

    public T first() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }
        //para pegar o primeiro elemento
        return lista.get(0);
    }

    public void print() {
        System.out.print("[");
        
        // comando para verificar se a lista está vazia ou não
        if (!lista.isEmpty()) {
            System.out.print(lista.get(0));
        }
        for (int i = 1; i < lista.size(); i++) {
            System.out.print(", " + lista.get(i));
        }
        System.out.println("]");
    }
}
