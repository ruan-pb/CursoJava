/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaolambda.ExemploLambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class ProgramacaoLambda {     
        

    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.00));

        list.add(new Produto("Notebook", 1200.00));

        list.add(new Produto("Tablet", 450.00));

        //Quando se tem apenas uma linha de comando, pode simplificar retirando p 'return' e o abre e fecha chaves
        //isso é uma função lambda, em outras palavras, uma função anonima.
        
        //Comparator<Produto>comp = ((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        //list.sort(comp);
        
        // podemos simplificar mais ainda colocando a função lambda(Função Anonima) em apenas em uma linha, basta colocar dentro do metodo sort
        //como no exemplo abaixo.
        
        
        // para fazer todos esses comando "sort" e utilizar a classe produto, se faz necessario a implementação da classe Comparator<Produto>
        //só assim a função lambda(Função Anonima)funcionaria, por causa da comparação de produtos
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Produto p : list) {

            System.out.println(p);

        }

    }
}


