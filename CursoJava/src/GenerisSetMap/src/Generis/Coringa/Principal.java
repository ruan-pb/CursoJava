/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generis.Coringa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruanc
 */
public class Principal {

    public static void main(String[] args) {

        List<Forma> myShapes = new ArrayList<>();

        
        
        myShapes.add(new Retangulo(3.0, 2.0));

        myShapes.add(new Circulo(2.0));

        List<Circulo> myCircles = new ArrayList<>();

        myCircles.add(new Circulo(2.0));

        myCircles.add(new Circulo(3.0));

        
        // no casso de imprimir um totalArea do time my Shapees, é que ele vai somar as medidas de todas as formas
        //seja circulo ou retangulo ele vai somar os dois calculos
        
        // no casso de imprimir um totalArea do time myCircle ele vai apenas somar os circulos
        System.out.println("Total area: " + totalArea(myShapes));

    }

    // o coringa <?> vai reclamar que o tipo da lista não é necessariamente do tipo Forma(Classe), porriso tem que fazer List<? extends Forma> list
    // para fazer o coringa extender a classe forma, para ele fazer essa operação
    // caso ao contratio ele só funcionaria para List<Forma> list, ou seja so receberia a lista se ela fosse do tipo forma
    public static double totalArea(List<? extends Forma> list) {

        double sum = 0.0;

        for (Forma s : list) {

            sum += s.area();

        }

        return sum;

    }

}
